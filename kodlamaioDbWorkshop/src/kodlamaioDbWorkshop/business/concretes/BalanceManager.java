package kodlamaioDbWorkshop.business.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDbWorkshop.entities.concretes.Balance;

public class BalanceManager{
	List<Balance> balances;
	
	public BalanceManager() {
		balances = new ArrayList<>();
	}
	
	public void add(Balance balance) {
		balances.add(balance);
		System.out.println("Bilanço eklendi= ID:" + balance.getId() + " / CustomerID: " + balance.get_customer().getId() + " / Amount: " + balance.getAmount());
	}
	
	public List<Balance> getAll(){
		return balances;
	}

}
