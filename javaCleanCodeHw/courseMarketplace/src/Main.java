import business.abstracts.ICourseService;
import business.concretes.CourseManager;
import business.concretes.PercentageSaleCampaignManager;
import dataAccess.concretes.entityFramework.EfCourseDal;
import entities.concretes.Course;

public class Main {

	public static void main(String[] args) {
		ICourseService courseService = new CourseManager(new EfCourseDal(), new PercentageSaleCampaignManager());
		for (Course course : courseService.getCourses()) {
			System.out.println(course.getName() + " = " + course.getPrice());
		}

	}

}
