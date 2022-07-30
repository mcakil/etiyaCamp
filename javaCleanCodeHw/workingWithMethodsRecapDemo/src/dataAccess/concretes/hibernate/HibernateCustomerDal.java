package dataAccess.concretes.hibernate;

import dataAccess.abstracts.ICustomerDal;
import entities.concretes.Customer;

public class HibernateCustomerDal implements ICustomerDal {

	@Override
	public void add(Customer customer) {
		System.out.println("Added to the database using Hibernate.");
	}

	@Override
	public boolean customerExists(Customer customer) {
		return true;
	}	
}
