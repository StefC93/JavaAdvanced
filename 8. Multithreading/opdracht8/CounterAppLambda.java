package opdracht8;

public class CounterAppLambda {

	public static void main(String[] args) throws InterruptedException {

		CounterSync counter = new CounterSync();
		Thread t1 = new Thread(() -> increment(counter, 100000));
		Thread t2 = new Thread(() -> increment(counter, 100000));
		Thread t3 = new Thread(() -> decrement(counter, 123456));

		t1.start();
		t2.start();
		t3.start();

		t1.join();
		t2.join();
		t3.join();

		System.out.println(counter.getCount());
	}

	private static void decrement(CounterSync counter, int number) {
		for (int i = 0; i < number; i++) {
			counter.decrement();
		}
	}

	private static void increment(CounterSync counter, int number) {
		for (int i = 0; i < number; i++) {
			counter.increment();
		}

	}

}
