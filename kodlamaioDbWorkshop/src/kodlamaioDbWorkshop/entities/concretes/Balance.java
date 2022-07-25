package kodlamaioDbWorkshop.entities.concretes;

import java.util.Calendar;

import kodlamaioDbWorkshop.entities.abstracts.BaseCustomer;

public class Balance {
	
	private int _id;
	private BaseCustomer _customer;
	private double _amount;
	private Calendar _date;
	
	public Balance(int id, BaseCustomer customer, double amount, Calendar date) {
		_id = id;
		set_customer(customer);
		_amount = amount;
		_date = date;
	}
	
	public int getId() {
		return _id;
	}
	public void setId(int id) {
		this._id = id;
	}

	public BaseCustomer get_customer() {
		return _customer;
	}

	public void set_customer(BaseCustomer _customer) {
		this._customer = _customer;
	}

	public double getAmount() {
		return _amount;
	}
	public void setAmount(double amount) {
		this._amount = amount;
	}
	public Calendar getDate() {
		return _date;
	}
	public void setDate(Calendar date) {
		this._date = date;
	}
	
	
}
