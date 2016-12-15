package klasOefening;

public class PrintAppLambda {
//oefening powerpoint pagina 33
	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(() -> print('#', 100));
		Thread thread2 = new Thread(() -> print('*', 1000));

		thread1.setName("T1");
		thread1.setName("T2");
		thread1.start();
		thread2.start();

		Thread.sleep(470);
		thread1.interrupt();
		Thread.sleep(130);
		thread2.interrupt();
	}

	public static void print(char c, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(c);
			// Thread.yield(); // No need for yield anymore!
			try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {
				System.out.println(Thread.currentThread().getName() + ": Interrupted");
			}
		}
	}

}
