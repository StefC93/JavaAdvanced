package opdracht3;

public class PrintAppRunnable {

	public static void main(String[] args) {

		// Twee CharacterPrinter objecten met elk hun eigen argumenten
		CharacterPrinterYield p1 = new CharacterPrinterYield('*', 100);
		CharacterPrinterYield p2 = new CharacterPrinterYield('#', 100);

		// Beide threads starten
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);

		// Beide threads starten
		t1.start();
		t2.start();
	}

}
