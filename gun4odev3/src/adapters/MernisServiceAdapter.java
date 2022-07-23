package adapters;

import java.util.Calendar;
import abstracts.IValidationService;
import entities.Customer;

public class MernisServiceAdapter implements IValidationService {

	@Override
	public boolean isValid(Customer customer) {
		
		System.out.println("Customer " + customer.getUsername() + " with the following information is valid:");
		System.out.println("National ID: " + customer.getNationalityId() + " / "
			+ customer.getFirstName().toUpperCase() + " "
			+ customer.getLastName().toUpperCase() + " / Born in: " +
			+ customer.getDateOfBirth().get(Calendar.YEAR));
		System.out.println("-------");
		return true;
		
	}
	
}
