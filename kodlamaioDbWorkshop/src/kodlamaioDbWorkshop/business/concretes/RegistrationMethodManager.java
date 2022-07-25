package kodlamaioDbWorkshop.business.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDbWorkshop.entities.concretes.RegistrationMethod;

public class RegistrationMethodManager{
	List<RegistrationMethod> registrationMethods;
	
	public RegistrationMethodManager() {
		registrationMethods = new ArrayList<>();
	}
	
	public void add(RegistrationMethod registrationMethod) {
		registrationMethods.add(registrationMethod);
	}
	
	public List<RegistrationMethod> getAll() {
		return registrationMethods;
	}
	
}
