package business.concretes;

import java.util.List;

import business.abstracts.ICampaignService;
import business.abstracts.ICourseService;
import dataAccess.abstracts.ICourseDal;
import entities.concretes.Course;

public class CourseManager implements ICourseService {
	private ICourseDal _courseDal;
	private ICampaignService _campaignService;
	
	public CourseManager(ICourseDal courseDal, ICampaignService campaignService) {
		_courseDal = courseDal;
		_campaignService = campaignService;
	}



	public List<Course> getCourses() {
		
		List<Course> courses =  _courseDal.getCourses();
		_campaignService.updatePrices(courses);
		return courses;
		
	}

}
