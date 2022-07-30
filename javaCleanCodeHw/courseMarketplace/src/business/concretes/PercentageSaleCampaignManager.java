package business.concretes;

import java.util.List;

import business.abstracts.ICampaignService;
import entities.concretes.Course;

public class PercentageSaleCampaignManager implements ICampaignService{

	@Override
	public void updatePrices(List<Course> courses) {
		for (Course course : courses) {
			course.setPrice(course.getPrice()*(1.0-getCurrentPercentageSale()));
		}
	}
	
	private double getCurrentPercentageSale() {
		// TODO Auto-generated method stub
		return Double.parseDouble("0.5");
	}


}
