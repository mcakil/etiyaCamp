package abstracts;

import entities.Customer;

public interface IValidationService {
	boolean isValid(Customer customer);
}
