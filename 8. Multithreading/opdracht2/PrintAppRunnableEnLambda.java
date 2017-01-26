package opdracht2;

public class PrintAppRunnableEnLambda implements Runnable {

	public static void main(String[] args) {
		// Object van de klasse gemaakt met implements Runnable
		PrintAppRunnableEnLambda p1 = new PrintAppRunnableEnLambda('*', 100);
		// Thread object gemaakt met lambda expressie
		Thread p2 = new Thread(() -> print('#', 100));

		// Klasse object aan een Thread object toewijzen
		Thread t1 = new Thread(p1);

		// Beide Thread objecten starten
		t1.start();
		p2.start();

	}

	private char c;
	private int count;

	public PrintAppRunnableEnLambda(char c, int count) {
		this.c = c;
		this.count = count;
	}

	@Override
	public void run() {
		for (int i = 0; i < count; i++) {
			System.out.print(c);
		}
	}

	private static void print(char c, int count) {
		for (int i = 0; i < count; i++) {
			System.out.print(c);
		}
	}

}
