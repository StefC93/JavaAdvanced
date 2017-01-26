package boekVoorbeeld6;

public class PrintAppLambdaSleepInterrupt {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(() -> print('*', 100));
		Thread t2 = new Thread(() -> print('#', 100));

		t1.setName("Thread1");
		t2.setName("Thread2");

		t1.start();
		t2.start();

		Thread.sleep(470);
		t1.interrupt();
		Thread.sleep(130);
		t2.interrupt();
	}

	private static void print(char c, int count) {
		for (int i = 0; i < count; i++) {
			System.out.print(c);
			// Thread.yield(); // Overbodig vanwege sleep()
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.print(Thread.currentThread().getName() + " interrupted");
			}
		}
	}

}
