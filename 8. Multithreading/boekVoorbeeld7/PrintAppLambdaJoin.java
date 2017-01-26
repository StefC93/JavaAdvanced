package boekVoorbeeld7;

public class PrintAppLambdaJoin {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(() -> print('*', 10));
		Thread t2 = new Thread(() -> print('#', 10));

		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("end");

	}

	private static void print(char c, int count) {
		for (int i = 0; i < count; i++) {
			System.out.print(c);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.getMessage();
			}
		}
	}

}
