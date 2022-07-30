package dataAccess.abstracts;

import entities.concretes.Customer;

public interface ICustomerDal {
	
	/**
	 * A method that provides a way to add a customer to a database.
	 * @param customer The customer that is going to be added to a database.
	 */
	void add(Customer customer);
	boolean customerExists(Customer customer);
}
