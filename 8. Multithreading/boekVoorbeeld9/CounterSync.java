package boekVoorbeeld9;

public class CounterSync {
	private int count = 0;
	// Object gebruiken als monitor
	//private Object monitor = new Object();

	// Indien alles binnen de methode gemonitord moet worden
	// kunnen we het woord synchronized aan de methode toevoegen
	public synchronized void increment() {
		count++;
/*		synchronized (monitor) {
			count++;
		}*/
		
		// Op deze manier wordt het teller object zelf als monitor gebruikt
/*		synchronized (this) {
			count++;
		}*/
	}

	// Indien alles binnen de methode gemonitord moet worden
	// kunnen we het woord synchronized aan de methode toevoegen
	public synchronized void decrement() {
		count--;
/*		synchronized (monitor) {
			count--;
		}*/
		
		// Op deze manier wordt het teller object zelf als monitor gebruikt
/*		synchronized (this) {
			count--;
		}*/
	}

	public int getCount() {
		return count;
	}

}