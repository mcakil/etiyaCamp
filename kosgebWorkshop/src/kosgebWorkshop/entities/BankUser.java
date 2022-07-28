package kosgebWorkshop.entities;

public class BankUser extends User{
	
	private Bank bank;
	
	public BankUser(int id, String username, String password, Bank bank) {
		super(id, username, password);
		this.setBank(bank);
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

}
