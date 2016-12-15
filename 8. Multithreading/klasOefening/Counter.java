package klasOefening;

public class Counter {
	private int count = 0;
	private Object monitor = new Object();

	public synchronized void increment() {
		synchronized (this) {
			count++;
		}
	}

	public void decrement() {
		synchronized (monitor) {
			count = count - 1;
		}
	}

	public int getCount() {
		return count;
	}
}
