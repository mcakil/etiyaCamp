package kosgebWorkshop.entities;

public class Corporate extends Applicant{

	private String title;
	
	public Corporate(int id, String username, String password, String title) {
		super(id, username, password);
		this.setTitle(title);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
