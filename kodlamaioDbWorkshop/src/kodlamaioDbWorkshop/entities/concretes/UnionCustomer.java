package kodlamaioDbWorkshop.entities.concretes;

import kodlamaioDbWorkshop.entities.abstracts.BaseCustomer;

public class UnionCustomer extends BaseCustomer {
	private String _name;

	public UnionCustomer(int id, String customerNumber, RegistrationMethod registrationMethod, String name) {
		super.setId(id);
		super.setCustomerNumber(customerNumber);
		super.setRegistrationMethod(registrationMethod);
		_name = name;
	}
	
	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}
}
