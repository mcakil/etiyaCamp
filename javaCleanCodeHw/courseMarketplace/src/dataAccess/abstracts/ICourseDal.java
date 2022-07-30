package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Course;

public interface ICourseDal {

	List<Course> getCourses();

}
