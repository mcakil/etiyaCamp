package gun3odev2;

public class Instructor extends User {
	private String title;
	private Course[] taughtCourses;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Course[] getTaughtCourses() {
		return taughtCourses;
	}

	public void setTaughtCourses(Course[] taughtCourses) {
		this.taughtCourses = taughtCourses;
	}

}
