package business.concretes;

import java.util.List;

import business.abstracts.ICampaignService;
import entities.concretes.Course;

public class StandardPriceCampaignManager implements ICampaignService{

	@Override
	public void updatePrices(List<Course> courses) {
		for (Course course : courses) {
			course.setPrice(getCurrentStandardPrice());
		}
	}
	
	private double getCurrentStandardPrice() {
		//access the database to get the current price
		return 150.0;
	}

}
