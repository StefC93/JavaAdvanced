package boekVoorbeeld8;

public class CounterAppLambda {

	public static void main(String[] args) throws InterruptedException {

		Counter counter = new Counter();
		Thread t1 = new Thread(() -> increment(counter, 100000));
		Thread t2 = new Thread(() -> increment(counter, 100000));
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(counter.getCount());
	}

	private static void increment(Counter counter, int number) {
		for (int i = 0; i < number; i++){
			counter.increment();
		}
	}

}
