package inheritence;

public class Main {
	
	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
		customer.firstName = "Tahsin";
		customer.email = "example@example.com";
		employee.id = 1;
		employee.salary = 500;
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		customerManager.add();
		employeeManager.list();
		employeeManager.bestEmployee();
	}
	
}
