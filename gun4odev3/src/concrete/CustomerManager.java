package concrete;

import abstracts.IValidationService;
import entities.Customer;

public class CustomerManager {
	
	IValidationService _validationService;
	
	public CustomerManager(IValidationService validationService) {
		_validationService = validationService;
	}
	
	public void addCustomer(Customer customer) {
		if (_validationService.isValid(customer)) {
			System.out.println(customer.getUsername() + " added to the database");
		} else {
			System.out.println(customer.getUsername() + "'s credientials are not valid.");
		}
	}
	
	public void removeCustomer(Customer customer) {
		System.out.println(customer.getUsername() + " removed from the database");
	}
	
	public void updateCustomer(Customer customer) {
		System.out.println(customer.getUsername() + " has their info updated.");
	}
}
