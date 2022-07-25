package kodlamaioDbWorkshop.entities.concretes;

import kodlamaioDbWorkshop.entities.abstracts.BaseCustomer;

public class Address {
	private int _id;
	private BaseCustomer _customer;
	private String _addressDetails;
	
	public Address(int id, BaseCustomer customer, String addressDetails) {
		_id = id;
		_customer = customer;
		_addressDetails = addressDetails;
	}
	
	public int getId() {
		return _id;
	}
	public void setId(int id) {
		_id = id;
	}
	
	public BaseCustomer getCustomer() {
		return _customer;
	}

	public void setCustomer(BaseCustomer customer) {
		this._customer = customer;
	}

	public String getAddressDetails() {
		return _addressDetails;
	}
	public void setAddressDetails(String addressDetails) {
		_addressDetails = addressDetails;
	}
	
	
	
}
