public class Main {

	public static void main(String[] args) {
		/*In Java, we can't instantiate a non-static inner class in a static method
		 * unless we create an instance of the outer class itself.*/
		Main main = new Main();
		CustomerManager customerManager = main.new CustomerManager(main.new EfCustomerDal(), main.new KpsServiceAdapter() );

		Customer customer = main.new Customer();
		customer.setFirstName("Adam");
		customer.setLastName("Brown");
		customer.setIdentityNumber("111");

		Customer customer2 = main.new Customer();
		customer2.setFirstName("J");
		customer2.setLastName("Brown");
		customer2.setIdentityNumber("222");
		customer2.setCityId(1);

		/*in Java, we must handle exceptions with try/catch blocks to not 
		 * have compiler errors, which is not the case in C#*/
		try {
			customerManager.add(customer);
			customerManager.addByOtherBusiness(customer2);
		} catch(Exception e) {
			System.out.println("Customer cannot be added to the database for the following reason: " + e.getMessage());
		}
		
	}

	public class CustomerManager {
		
		ICustomerDal _customerDal;
		IPersonService _personService;
		
		/**Constructs a CustomerManager object, taking the two objects that it needs to function with as its parameters.
		 * 
		 * @param customerDal Needed to access the database to add/update/delete customers.
		 * @param personService Needed to validate the user to make sure the information they gave us is real and valid.
		 */
		public CustomerManager(ICustomerDal customerDal, IPersonService personService) {
			_customerDal = customerDal;
			_personService = personService;
		}

		public void add(Customer customer) throws Exception {

			validateFirstNameIfEmpty(customer);
			validateIdentityNumberIfEmpty(customer);
			
			checkPersonExists(customer);
			checkCustomerExists(customer);
			_customerDal.add(customer);

		}
		public void addByOtherBusiness(Customer customer) throws Exception {

			validateFirstNameIfEmpty(customer);
			validateLastNameIfEmpty(customer);
			validateFirstNameLength(customer);

			checkCustomerExists(customer);
			_customerDal.add(customer);
	
		}

		private void checkCustomerExists(Customer customer) throws Exception {
			if (_customerDal.customerExists(customer)) {
				throw new Exception("Customer already exists in the database.");
			}
		}
		
		/**
		 * Checks if the person's given information is real and valid.
		 * @param customer The customer whose information's validity will be checked.
		 * @throws Exception is thrown if the given information is not real or valid.
		 */
		private void checkPersonExists(Customer customer) throws Exception {
			if (!_personService.checkPerson(customer)) {
				throw new Exception("Customer information is not correct.");
			}
		}
		
		private void validateFirstNameIfEmpty(Customer customer) throws Exception {

			if (customer.getFirstName().trim().isEmpty() || customer.getFirstName() == null) {

				throw new Exception("Customer's first name is empty.");

			}
		}

		private void validateLastNameIfEmpty(Customer customer) throws Exception {

			if (customer.getLastName().trim().isEmpty() || customer.getLastName() == null) {

				throw new Exception("Customer's last name is empty.");

			}
		}

		private void validateIdentityNumberIfEmpty(Customer customer) throws Exception {

			if (customer.getIdentityNumber().trim().isEmpty() || customer.getIdentityNumber() == null) {

				throw new Exception("Customer's identity number is empty.");

			}
		}

		private void validateFirstNameLength(Customer customer) throws Exception {

			if (customer.getFirstName().length() < 2) {

				throw new Exception("Customer's name must consist of at least two characters.");

			}
		}

	}
	
	public interface ICustomerDal {
		/**
		 * A method that provides a way to add a customer to a database.
		 * @param customer The customer that is going to be added to a database.
		 */
		void add(Customer customer);
		boolean customerExists(Customer customer);
	}
	
	public class EfCustomerDal implements ICustomerDal {

		@Override
		public void add(Main.Customer customer) {
			System.out.println("Added to the database using Entity Framework.");
		}

		@Override
		public boolean customerExists(Main.Customer customer) {
			return true;
		}
		
	}
	
	public class HibernateCustomerDal implements ICustomerDal {

		@Override
		public void add(Main.Customer customer) {
			System.out.println("Added to the database using Hibernate.");
		}

		@Override
		public boolean customerExists(Main.Customer customer) {
			return true;
		}
		
	}

	public class Customer extends Person {
		/*Unlike C#, Java does not have built-in properties, so we have to add getter
		 * and setter methods ourselves. */
		private int cityId;

		public int getCityId() {
			return cityId;
		}
		public void setCityId(int cityId) {
			this.cityId = cityId;
		}

	}
	
	public class KpsService {
		
		public boolean checkPerson(long nationalityId, String name, String lastName, int year) {
			
			return true;
			
		}
	}
	
	public class KpsServiceAdapter implements IPersonService {

		@Override
		public boolean checkPerson(Person person) {
			KpsService kpsService = new KpsService();
			return kpsService.checkPerson(Long.parseLong(person.getIdentityNumber()), person.getFirstName(), person.getLastName(), person.getYearOfBirth());
		}
		
	}
	
	public interface IPersonService {
		boolean checkPerson(Person person);
	}
	
	public class Person {
		
		private int id;
		private String firstName;
		private String lastName;
		private String identityNumber;
		private int yearOfBirth;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getIdentityNumber() {
			return identityNumber;
		}
		public void setIdentityNumber(String identityNumber) {
			this.identityNumber = identityNumber;
		}
		public int getYearOfBirth() {
			return yearOfBirth;
		}
		public void setYearOfBirth(int yearOfBirth) {
			this.yearOfBirth = yearOfBirth;
		}
		
	}
	
}
