public class Main {

	public static void main(String[] args) {
		/*In Java, we can't instantiate a non-static inner class in a static method
		 * unless we create an instance of the outer class itself.*/
		Main main = new Main();
		CustomerManager customerManager = main.new CustomerManager();

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

		public void add(Customer customer) throws Exception {

			validateFirstNameIfEmpty(customer);
			validateIdentityNumberIfEmpty(customer);

			CustomerDal customerDal = new CustomerDal();
			checkCustomerExists(customer);
			customerDal.add(customer);

		}

		public void addByOtherBusiness(Customer customer) throws Exception {

			validateFirstNameIfEmpty(customer);
			validateLastNameIfEmpty(customer);
			validateFirstNameLength(customer);

			CustomerDal customerDal = new CustomerDal();
			checkCustomerExists(customer);
			customerDal.add(customer);
	
		}

		private void checkCustomerExists(Customer customer) throws Exception {
			CustomerDal customerDal = new CustomerDal();
			if (customerDal.customerExists(customer)) {
				throw new Exception("Customer already exists in the database.");
			}
		}
		
		private void validateFirstNameIfEmpty(Customer customer) throws Exception {

			if ((customer.getFirstName().trim().isEmpty() || customer.getFirstName() == null)){

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

	public class CustomerDal {

		public void add(Customer customer) {
			System.out.println("Customer "+ customer.getFirstName()+" is added to the database.");
		}
		
		public boolean customerExists(Customer customer) {
			return false;
		}

	}

	public class Customer {
		/*Unlike C#, Java does not have built-in properties, so we have to add getter
		 * and setter methods ourselves. */
		private int id;
		private int cityId;

		private String firstName;
		private String lastName;
		private String identityNumber;

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getCityId() {
			return cityId;
		}
		public void setCityId(int cityId) {
			this.cityId = cityId;
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

	}

}
