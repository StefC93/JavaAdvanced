package boekVoorbeeldDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeVoorbeeld {

	public static void main(String[] args) {
		// Deque aanmaken
		Deque<String> train = new ArrayDeque<>();

		// Met de methodes offerFirst en offerLast kan men kiezen
		// of het element vooraan of achteraan de Deque wordt toegevoegd
		train.offerFirst("Locomotive1");
		train.offerLast("Wagon1");
		train.offerLast("Wagon2");
		train.offerLast("Wagon3");
		train.offerLast("Wagon4");
		train.offerLast("Wagon5");
		train.offerFirst("Locomotive2");
		train.offerLast("Wagon6");
		train.offerLast("Wagon7");
		train.offerLast("Wagon8");
		train.offerLast("Wagon9");
		train.offerLast("Wagon10");

		// Het eerstvolgende element opvragen en in de variabele unit steken
		// Daarna wordt het element uit de Deque verwijdert
		String unit = train.pollFirst();
		
		// Zolang er elementen zitten in de Deque worden deze afgeprint
		while (unit != null) {
			System.out.println(unit);
			unit = train.pollFirst();
		}
	}

}
