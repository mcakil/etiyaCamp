package interfaceDemo;

public class Robot implements IWorkable, IMaintainable {

	@Override
	public void work() {
		System.out.println("A robot can work in our corporation.");
	}

	@Override
	public void maintain() {
		System.out.println("A robot can be maintained.");
	}

}
