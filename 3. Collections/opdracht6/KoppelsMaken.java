package opdracht6;
import java.util.ArrayDeque;
import java.util.Deque;

public class KoppelsMaken {

	public static void main(String[] args) {
		// Deque's aanmaken
		// Eerste om eerst iedereen in te steken
		// Tweede om koppels te vormen
		Deque<String> personen = new ArrayDeque<>();
		Deque<String> koppels = new ArrayDeque<>();

		// 5 mannen en 5 vrouwen in de eerste Deque steken
		// mannen vooraan, vrouwen achteraan
		for (int i = 0; i < 5; i++) {
			personen.addFirst("Man");
			personen.addLast("Vrouw");
		}
		System.out.println("Originele array: " + personen);

		// Eerste elemente van Deque personen opvragen
		// Het element in de String m steken en verwijderen uit de deque
		String m = personen.pollFirst();
		// String v = personen.pollLast();

		// Zolang als er element zijn
		while (m != null) {
			koppels.addLast(m); // Het eerste element (man) van personen wordt
								// toegevoged aan koppels
			m = personen.pollLast(); // In de String m steken we nu het laatste
										// element (vrouw) van personen
			koppels.addLast(m); // Dit element vanachter toevoegen aan koppels.
								// Hierdoor krijg je steeds man/vrouw -
								// man/vrouw - ...
			m = personen.pollFirst();

		}

		// Alternatieve manier om het op te lossen door gebruik te maken van
		// een aparte string voor man en vrouw ipv dezelfde string te hergebruiken
		/*
		 * while (m != null) { 
		 	* koppels.addLast(m);
		 	* koppels.addLast(v);
		 	* m = personen.pollFirst();
		 	* v = personen.pollLast(); }
		 */

		System.out.println("Originele array na maken van koppels: " + personen);
		System.out.println("Array na het maken van koppels: " + koppels);
	}

}
