package referenceTypesDemo;

public class Main {

	public static void main(String[] args) {
		
		int num1 = 20;
		int num2 = 25;
		num1 = num2;
		num2 = 30;
		System.out.println(num1);
		
		int[] sayilar1 = new int[] {1, 2, 3};
		int[] sayilar2 = new int[] {4, 5, 6};
		sayilar1 = sayilar2;
		sayilar2[0] = 30;
		System.out.println(num2);
		
		Main main = new Main();
		Customer customer = main.new Customer();
		Product product = main.new Product();
		
		PersonDal personDal = main.new PersonDal();
		personDal.add(customer);
		personDal.add(main.new Employee());
	}
	
	class Person {
		private int id;
		private String firstName;
		
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
	}
	
	class Customer extends Person {
		private String creditCardNo;

		public String getCreditCardNo() {
			return creditCardNo;
		}

		public void setCreditCardNo(String creditCardNo) {
			this.creditCardNo = creditCardNo;
		}
		
	}
	
	class Employee extends Person {
		private double salary;

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}
	}
	
	class Product {
		private int id;
		private String name;
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	
	class PersonDal {
		public void add(Person person) {
			
		}
	}
}
