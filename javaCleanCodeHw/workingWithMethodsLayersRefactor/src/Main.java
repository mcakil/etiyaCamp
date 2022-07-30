import business.concretes.CustomerManager;
import business.serviceAdapters.KpsServiceAdapter;
import dataAccess.concretes.entityFramework.EfCustomerDal;
import entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		/*In Java, we can't instantiate a non-static inner class in a static method
		 * unless we create an instance of the outer class itself.*/
		CustomerManager customerManager = new CustomerManager(new EfCustomerDal(), new KpsServiceAdapter() );

		Customer customer = new Customer();
		customer.setFirstName("Adam");
		customer.setLastName("Brown");
		customer.setIdentityNumber("111");

		Customer customer2 = new Customer();
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
	
	
	
	
	
}
