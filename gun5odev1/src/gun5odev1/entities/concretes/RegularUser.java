package gun5odev1.entities.concretes;

import gun5odev1.entities.abstracts.BaseUser;

public class RegularUser extends BaseUser{
		
	public RegularUser(int id, String firstName, String lastName, String email, String password) {
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setPassword(password);
	}

}
