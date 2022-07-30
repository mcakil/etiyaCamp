package business.concretes;

import business.abstracts.IPersonService;
import dataAccess.abstracts.ICustomerDal;
import entities.concretes.Customer;

public class CustomerManager {
	
	ICustomerDal _customerDal;
	IPersonService _personService;
	
	/**Constructs a CustomerManager object, taking the two objects that it needs to function with as its parameters.
	 * 
	 * @param customerDal Needed to access the database to add/update/delete customers.
	 * @param personService Needed to validate the user to make sure the information they gave us is real and valid.
	 */
	public CustomerManager(ICustomerDal customerDal, IPersonService personService) {
		_customerDal = customerDal;
		_personService = personService;
	}

	public void add(Customer customer) throws Exception {

		validateFirstNameIfEmpty(customer);
		validateIdentityNumberIfEmpty(customer);
		
		checkPersonExists(customer);
		checkCustomerExists(customer);
		_customerDal.add(customer);

	}
	public void addByOtherBusiness(Customer customer) throws Exception {

		validateFirstNameIfEmpty(customer);
		validateLastNameIfEmpty(customer);
		validateFirstNameLength(customer);

		checkCustomerExists(customer);
		_customerDal.add(customer);

	}

	private void checkCustomerExists(Customer customer) throws Exception {
		if (_customerDal.customerExists(customer)) {
			throw new Exception("Customer already exists in the database.");
		}
	}
	
	/**
	 * Checks if the person's given information is real and valid.
	 * @param customer The customer whose information's validity will be checked.
	 * @throws Exception is thrown if the given information is not real or valid.
	 */
	private void checkPersonExists(Customer customer) throws Exception {
		if (!_personService.checkPerson(customer)) {
			throw new Exception("Customer information is not correct.");
		}
	}
	
	private void validateFirstNameIfEmpty(Customer customer) throws Exception {

		if (customer.getFirstName().trim().isEmpty() || customer.getFirstName() == null) {

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
