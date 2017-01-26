package boekVoorbeeld5;

public class PrintAppLambdaDaemon {

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> print('*', 100));
		Thread t2 = new Thread(() -> print('#', 1000));

		// De setDaemon methode zorgt ervoor dat de main thread niet op dit
		// specifieke thread moet wachten om de applicatie te beëindigen
		t2.setDaemon(true);
		t1.start();
		t2.start();
	}

	private static void print(char c, int count) {
		for (int i = 0; i < count; i++) {
			System.out.print(c);
			Thread.yield();
		}
	}

}
