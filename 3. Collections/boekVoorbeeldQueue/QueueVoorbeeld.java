package boekVoorbeeldQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueVoorbeeld {

	public static void main(String[] args) {
		// Queue aanmaken en elementen toevoegen
		Queue<String> queue = new LinkedList<>();
		queue.offer("Stef");
		queue.offer("Jos");
		queue.offer("Marie");
		queue.offer("Julie");

		// Aan de variabele s wordt het eerste element toegekend
		// peek = kijken welke het eerstvolgende element is
		String s = queue.peek();
		
		while (s != null) { // Deze loop blijft herhalen tot de queue leeg is
			System.out.println("About to handle: " + s);
			s = queue.poll(); // Het eerstvolgende element aan s toekennen en verwijderen uit de queue
			System.out.println("Handling: " + s);
			s = queue.peek(); // Kijken wat het eerstvolgende element is
		}
	}

}
