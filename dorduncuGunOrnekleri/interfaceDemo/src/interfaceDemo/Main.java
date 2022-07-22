package interfaceDemo;

public class Main {

	public static void main(String[] args) {
		Worker worker = new Worker();
		worker.eat();
		worker.pay();
		
		Robot robot = new Robot();
		robot.maintain();
		
		OutsourceWorker outsourceWorker = new OutsourceWorker();
		outsourceWorker.work();
	}

}
