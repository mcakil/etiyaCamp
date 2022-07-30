package business.abstracts;

import java.util.List;

import entities.concretes.Course;

public interface ICampaignService {
	void updatePrices(List<Course> courses);
}
