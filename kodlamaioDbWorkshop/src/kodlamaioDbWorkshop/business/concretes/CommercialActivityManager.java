package kodlamaioDbWorkshop.business.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDbWorkshop.entities.concretes.CommercialActivity;

public class CommercialActivityManager {
	List<CommercialActivity> commercialActivities;
	
	public CommercialActivityManager() {
		commercialActivities = new ArrayList<>();
	}
	
	public void add(CommercialActivity commercialActivity) {
		commercialActivities.add(commercialActivity);
		System.out.println("Ticari faaliyet eklendi= ID: " + commercialActivity.getId() + " / CustomerID: " + commercialActivity.getRealCustomer().getId() + " / StartDate: " + commercialActivity.getStartDate().getTime());
	}
	
	public List<CommercialActivity> getAll(){
		return commercialActivities;
	}
}
