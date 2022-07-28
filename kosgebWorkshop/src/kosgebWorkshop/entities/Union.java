package kosgebWorkshop.entities;

public class Union extends Applicant {

	private String name;
	
	public Union(int id, String username, String password, String name) {
		super(id, username, password);
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
