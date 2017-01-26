package opdracht1;

public class PrintApp {

	public static void main(String[] args) {
		PrintThread p1 = new PrintThread('*', 100);
		PrintThread p2 = new PrintThread('#', 100);

		p1.start();
		p2.start();
	}

}
