package gun3odev2;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getUsername() + " added.");
	}
	
	public void delete(User user) {
		System.out.println(user.getUsername() + " deleted.");
	}
}
