package gun3odev2;

public class Student extends User{
	private Course[] takenCourses;

	public Course[] getTakenCourses() {
		return takenCourses;
	}

	public void setTakenCourses(Course[] takenCourses) {
		this.takenCourses = takenCourses;
	}

}
