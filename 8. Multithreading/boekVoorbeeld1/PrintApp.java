package boekVoorbeeld1;

public class PrintApp {

	public static void main(String[] args) {

		// Twee threads met elk hun eigen print
		PrintThread p1 = new PrintThread('*', 100);
		PrintThread p2 = new PrintThread('#', 100);

		// Beide threads starten
		p1.start();
		p2.start();
	}

}
