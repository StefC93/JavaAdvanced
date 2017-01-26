package opdracht8;

public class CounterSync {
	private int count = 0;

	// Indien alles binnen de methode gemonitord moet worden
	// kunnen we het woord synchronized aan de methode toevoegen
	public synchronized void increment() {
		count++;
	}

	// Indien alles binnen de methode gemonitord moet worden
	// kunnen we het woord synchronized aan de methode toevoegen
	public synchronized void decrement() {
		count--;
	}

	public int getCount() {
		return count;
	}

}