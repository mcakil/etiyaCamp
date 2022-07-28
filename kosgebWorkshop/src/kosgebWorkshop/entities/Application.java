package kosgebWorkshop.entities;

public class Application {
	
	private int id;
	private Applicant applicant;
	private Credit credit;
	private ApplicationStatus status;
	
	public Application(int id, Applicant applicant, Credit credit, ApplicationStatus status) {
		super();
		this.id = id;
		this.applicant = applicant;
		this.credit = credit;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Applicant getApplicant() {
		return applicant;
	}

	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}

	public Credit getCredit() {
		return credit;
	}

	public void setCredit(Credit credit) {
		this.credit = credit;
	}

	public ApplicationStatus getStatus() {
		return status;
	}

	public void setStatus(ApplicationStatus status) {
		this.status = status;
	}
	
	
	
}
