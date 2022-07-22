package gun3odev2;

public class StudentManager extends UserManager {

	public void sendAssignment(Student student, Course course) {
		System.out.println(student.getUsername() 
				+ " with the id of " + student.getId()
				+ " has sent their assignment for " + course.getName());
	}
	
}
