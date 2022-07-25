package kodlamaioDbWorkshop.entities.abstracts;

import kodlamaioDbWorkshop.entities.concretes.RegistrationMethod;

public abstract class BaseCustomer implements ICustomer {
	private int _id;
	private String _customerNumber;
	private RegistrationMethod _registrationMethod;

	public int getId() {
		return _id;
	}
	public void setId(int id) {
		_id = id;
	}
	public String getCustomerNumber() {
		return _customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		_customerNumber = customerNumber;
	}
	public RegistrationMethod getRegistrationMethod() {
		return _registrationMethod;
	}
	public void setRegistrationMethod(RegistrationMethod registrationMethod) {
		_registrationMethod = registrationMethod;
	}
}
