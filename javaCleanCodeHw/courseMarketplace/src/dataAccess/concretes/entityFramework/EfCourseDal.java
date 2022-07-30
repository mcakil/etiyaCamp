package dataAccess.concretes.entityFramework;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.ICourseDal;
import entities.concretes.Course;

public class EfCourseDal implements ICourseDal {

	@Override
	public List<Course> getCourses() {
		ArrayList<Course> courses = new ArrayList<>();
		Course course1 = new Course(1, "Java", 250.0);
		Course course2 = new Course(2, "Python", 200.0);
		courses.add(course1);
		courses.add(course2);
		return courses;
	}

}
