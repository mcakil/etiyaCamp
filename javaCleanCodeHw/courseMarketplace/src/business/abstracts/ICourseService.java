package business.abstracts;

import java.util.List;

import entities.concretes.Course;

public interface ICourseService {
	List<Course> getCourses();
}
