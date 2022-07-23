package abstracts;

import entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {
	
	public void save(Customer customer) {
		System.out.println("Saved to database: " + customer.getFirstName());
	}
	
}
