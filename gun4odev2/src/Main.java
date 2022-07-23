import java.util.Calendar;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Calendar dateOfBirth = Calendar.getInstance();
		dateOfBirth.clear();
		dateOfBirth.set(1995, 1, 1);
		
		Customer customer = new Customer();
		customer.setDateOfBirth(dateOfBirth);
		customer.setFirstName("Ali");
		customer.setLastName("Veli");
		customer.setNationalityId("99999999999");
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer);
		
	}

}
