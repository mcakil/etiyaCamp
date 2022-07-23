package adapters;

import java.util.Calendar;
import abstracts.ICustomerCheckService;
import entities.Customer;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		System.out.println("Customer with the following information is valid:");
		System.out.println("National ID: " + customer.getNationalityId() + " / "
			+ customer.getFirstName().toUpperCase() + " "
			+ customer.getLastName().toUpperCase() + " / Born in: " +
			+ customer.getDateOfBirth().get(Calendar.YEAR));
		System.out.println("-------");
		return true;
	}

}
