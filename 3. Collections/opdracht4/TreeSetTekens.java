package opdracht4;

import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetTekens {

	public static void main(String[] args) {

		// TreeSet en scanner aanmaken
		// TreeSet ordent alfabetisch of van laag naar hoog
		// voor numerieke waarden
		// Duplicaten worden verwijdert (afgeleide van Set)
		NavigableSet<String> woorden = new TreeSet<>();
		Scanner sc = new Scanner(System.in);

		// 5 woorden aan de user vragen en deze in de TreeSet steken
		for (int i = 0; i < 5; i++) {
			System.out.println("Voer enkele woorden in (" + (i + 1) + "/5):");
			String woord = sc.nextLine();
			woorden.add(woord);
		}
		sc.close();

		// TreeSet overlopen en afdrukken met behulp van lambda expressie
		woorden.forEach(s -> System.out.println(s));

		// De eerste en het laatste woord afdrukken
		System.out.println("Het eerste woord (alfabetisch) is: " + woorden.first());
		System.out.println("Het laatste woord (alfabetisch) is: " + woorden.last());
	}

}
