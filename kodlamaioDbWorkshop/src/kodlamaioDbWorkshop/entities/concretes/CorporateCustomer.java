package kodlamaioDbWorkshop.entities.concretes;

import kodlamaioDbWorkshop.entities.abstracts.BaseCustomer;

public class CorporateCustomer extends BaseCustomer {
	private String _corporateName;
	private String _taxNumber;
	
	public CorporateCustomer(int id, String customerNumber, RegistrationMethod registrationMethod, String corporateName, String taxNumber) { //KanalId ekle
		super.setId(id);
		super.setCustomerNumber(customerNumber);
		super.setRegistrationMethod(registrationMethod);
		_corporateName = corporateName;
		_taxNumber = taxNumber;
	}
	
	public String getCorporateName() {
		return _corporateName;
	}
	public void setCorporateName(String corporateName) {
		this._corporateName = corporateName;
	}
	public String getTaxNumber() {
		return _taxNumber;
	}
	public void setTaxNumber(String taxNumber) {
		this._taxNumber = taxNumber;
	}
	
	
}
