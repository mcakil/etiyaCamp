package kodlamaioDbWorkshop.business.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDbWorkshop.business.abstracts.CustomerService;
import kodlamaioDbWorkshop.entities.abstracts.BaseCustomer;

public class CustomerManager implements CustomerService {
	
	List<BaseCustomer> customers;
	
	public CustomerManager() {
		customers = new ArrayList<BaseCustomer>();
	}
	
	@Override
	public void add(BaseCustomer customer) {
		if(!alreadyExists(customer.getId(), customer.getCustomerNumber())) {
			customers.add(customer);
			System.out.println("Müşteri numarası: " + customer.getCustomerNumber() + " olan müşterimiz bankamız veritabanına eklenmiştir.");
			
			return;
		}
		System.out.println("Bankamızda aynı id veya müşteri numarasıyla kayıtlı başka bir müşteri bulunduğu için kayıt işlemi başarısızıkla sonuçlanmıştır.");
		
	}

	@Override
	public List<BaseCustomer> getAll() {
		return customers;
	}
	
	/* id primary key, customerNumber unique key olduğu için 
	 * ikisinden biri listede var mı diye bakmalıyız.
	 */
	private boolean alreadyExists(int id, String customerNumber) {
		for(BaseCustomer existingCustomer : customers) {
			if (existingCustomer.getId() == id || existingCustomer.getCustomerNumber().equals(customerNumber)) {
				System.out.println();
				return true;
			}
		}
		return false;
	}
}
