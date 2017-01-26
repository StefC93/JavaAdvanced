package opdracht4;

import java.text.SimpleDateFormat;

public class PrintAppRunnable {

	public static void main(String[] args) {

		// Twee CharacterPrinter objecten met elk hun eigen argumenten
		CharacterPrinter p1 = new CharacterPrinter('*', 100);
		CharacterPrinter p2 = new CharacterPrinter('#', 100);
		// geen clock :(

		// Beide threads starten
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);

		// Van beide threads een daemon thread maken
		t1.setDaemon(true);
		t2.setDaemon(true);

		// Beide threads starten
		t1.start();
		t2.start();
	}

}