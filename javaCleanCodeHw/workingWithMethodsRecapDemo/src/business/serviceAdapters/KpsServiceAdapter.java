package business.serviceAdapters;

import business.abstracts.IPersonService;
import business.concretes.KpsService;
import entities.concretes.Person;

public class KpsServiceAdapter implements IPersonService {

	@Override
	public boolean checkPerson(Person person) {
		KpsService kpsService = new KpsService();
		return kpsService.checkPerson(Long.parseLong(person.getIdentityNumber()), person.getFirstName(), person.getLastName(), person.getYearOfBirth());
	}
	
}
