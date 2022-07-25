package kodlamaioDbWorkshop.entities.concretes;

import kodlamaioDbWorkshop.entities.abstracts.BaseCustomer;

public class RealCustomer extends BaseCustomer{
	private String _name, _surname, _nationalityId;

	
	
	public RealCustomer(int id, String customerNumber, RegistrationMethod registrationMethod,
						String name, String surname, String nationalityId) {
		super.setId(id);
		super.setCustomerNumber(customerNumber);
		super.setRegistrationMethod(registrationMethod);
		_name = name;
		_surname = surname;
		_nationalityId = nationalityId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}

	public String getSurname() {
		return _surname;
	}

	public void setSurname(String surname) {
		this._surname = surname;
	}

	public String getNationalityId() {
		return _nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this._nationalityId = nationalityId;
	}
	
	
}
