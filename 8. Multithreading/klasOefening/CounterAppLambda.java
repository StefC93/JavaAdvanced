package klasOefening;

public class CounterAppLambda {

	public static void main(String[] args) throws Exception {
		Counter counter = new Counter();
		Thread thread1 = new Thread(() -> increment(counter, 1000));
		Thread thread2 = new Thread(() -> increment(counter, 1000));

		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		
		System.out.println(counter.getCount());
	}

	private static void increment(Counter counter, int number) {
		for (int i = 0; i < number; i++) {
			counter.increment();
		}
	}
}
