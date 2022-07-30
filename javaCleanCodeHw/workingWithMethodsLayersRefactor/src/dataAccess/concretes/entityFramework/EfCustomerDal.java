package dataAccess.concretes.entityFramework;

import dataAccess.abstracts.ICustomerDal;
import entities.concretes.Customer;

public class EfCustomerDal implements ICustomerDal {

	@Override
	public void add(Customer customer) {
		System.out.println("Added to the database using Entity Framework.");
	}

	@Override
	public boolean customerExists(Customer customer) {
		return true;
	}
	
}
