package kodlamaioDbWorkshop.entities.concretes;

import java.util.Calendar;

public class CommercialActivity {
	private int _id;
	private RealCustomer _realCustomer;
	private Calendar _startDate;
	
	public CommercialActivity(int id, RealCustomer realCustomer, Calendar startDate) {
		_id = id;
		_realCustomer = realCustomer;
		_startDate = startDate;
	}
	
	public int getId() {
		return _id;
	}
	public void setId(int id) {
		_id = id;
	}
	public RealCustomer getRealCustomer() {
		return _realCustomer;
	}
	public void setRealCustomer(RealCustomer realCustomer) {
		_realCustomer = realCustomer;
	}
	public Calendar getStartDate() {
		return _startDate;
	}
	public void setStartDate(Calendar startDate) {
		_startDate = startDate;
	}
	
	
}
