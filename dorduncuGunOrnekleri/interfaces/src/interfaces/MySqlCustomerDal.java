package interfaces;

//NOT: syntax-> class ClassName extends SuperClassName implements IInterface1, IInterface2
public class MySqlCustomerDal implements ICustomerDal, IRepository {

	@Override
	public void add() {
		System.out.println("MySQL eklendi.");
	}

}
