package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		//NOT: abstract class onu extend eden classları referans olarak tutabilir
		GameCalculator gameCalculator = new ManGameCalculator();
		gameCalculator.hesapla();
		gameCalculator.gameOver();
	}

}
