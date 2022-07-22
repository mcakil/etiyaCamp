package interfaces;

public class Main {

	public static void main(String[] args) {
		//Interfaceler, abstract classlar gibi, inplement edildiği classları referans olarak tutabilir.
		ICustomerDal customerDal = new OracleCustomerDal();
		customerDal.add();
		
		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
		customerManager.add();
	}

}
