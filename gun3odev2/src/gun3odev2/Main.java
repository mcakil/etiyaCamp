package gun3odev2;

public class Main {
	
	public static void main(String[] args) {
		
		Course javaCourse = new Course("Java/React");
		Course cSharpCourse = new Course("C# / Angular");
		Course javaScriptCourse = new Course("JavaScript");
		Course fundamentalsCourse = new Course("Programming Fundamentals");
		
		Instructor instructor = new Instructor();
		instructor.setId(5);
		instructor.setUsername("James Brown");
		instructor.setTitle("Assistant");
		Course[] taughtCourses = new Course[] {javaCourse, cSharpCourse, fundamentalsCourse};
		instructor.setTaughtCourses(taughtCourses);
		
		Student student = new Student();
		student.setId(4);
		student.setUsername("Michael Doe");
		Course[] takenCourses = new Course[] {javaScriptCourse, cSharpCourse};
		student.setTakenCourses(takenCourses);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.sendAssignment(student, cSharpCourse);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addAssignment(instructor, fundamentalsCourse);
		instructorManager.delete(instructor);
	}
}
