package interfaceDemo;

public class Worker implements IWorkable, IEatable, IPayable{

	@Override
	public void work() {
		System.out.println("A worker can work in our corporation.");
	}

	@Override
	public void eat() {
		System.out.println("A worker's food expanses can be paid.");
	}

	@Override
	public void pay() {
		System.out.println("We pay the worker directly.");
	}

}
