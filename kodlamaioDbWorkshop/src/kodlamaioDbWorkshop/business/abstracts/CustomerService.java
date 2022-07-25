package kodlamaioDbWorkshop.business.abstracts;

import java.util.List;

import kodlamaioDbWorkshop.entities.abstracts.BaseCustomer;

public interface CustomerService {
	void add(BaseCustomer customer);
	List<BaseCustomer> getAll();
}
