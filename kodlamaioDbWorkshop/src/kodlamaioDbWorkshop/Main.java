package kodlamaioDbWorkshop;

import java.util.Calendar;

import kodlamaioDbWorkshop.business.concretes.AddressManager;
import kodlamaioDbWorkshop.business.concretes.BalanceManager;
import kodlamaioDbWorkshop.business.concretes.CommercialActivityManager;
import kodlamaioDbWorkshop.business.concretes.CustomerManager;
import kodlamaioDbWorkshop.entities.abstracts.BaseCustomer;
import kodlamaioDbWorkshop.entities.concretes.Address;
import kodlamaioDbWorkshop.entities.concretes.Balance;
import kodlamaioDbWorkshop.entities.concretes.CommercialActivity;
import kodlamaioDbWorkshop.entities.concretes.CorporateCustomer;
import kodlamaioDbWorkshop.entities.concretes.RealCustomer;
import kodlamaioDbWorkshop.entities.concretes.RegistrationMethod;
import kodlamaioDbWorkshop.entities.concretes.UnionCustomer;

public class Main {
	public static void main(String[] args) {
		RegistrationMethod method1 = new RegistrationMethod(1, "Şube");
		RegistrationMethod method2 = new RegistrationMethod(2, "İnternet");
		
		RealCustomer realCustomer = new RealCustomer(1, "100000", method1, "Adam", "Brown", "99999999999");
		BaseCustomer corporateCustomer = new CorporateCustomer(2, "200000", method2, "ACME Corp.", "1212121212");
		BaseCustomer unionCustomer = new UnionCustomer(3, "300000", method1, "Dentists' Union");
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(realCustomer);
		customerManager.add(corporateCustomer);
		customerManager.add(unionCustomer);
		
		Address address1 = new Address(1,realCustomer,"London");
		AddressManager addressManager = new AddressManager();
		addressManager.add(address1);
		
		Balance balance1 = new Balance(1, corporateCustomer, 5000.0, Calendar.getInstance());
		BalanceManager balanceManager = new BalanceManager();
		balanceManager.add(balance1);
		
		CommercialActivity commercialActivity1 = new CommercialActivity(1, realCustomer, Calendar.getInstance());
		CommercialActivityManager commercialActivityManager = new CommercialActivityManager();
		commercialActivityManager.add(commercialActivity1);
	
	}
}
