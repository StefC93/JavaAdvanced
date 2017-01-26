package boekVoorbeeld4;

public class PrintAppLambdaYield {

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> print('*', 100));
		Thread t2 = new Thread(() -> print('#', 100));

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
