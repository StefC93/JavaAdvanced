package opdracht8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EenmaligSorteren {

	public static void main(String[] args) {
		// List aanmaken
		List<Persoon> lijst = new ArrayList<>();

		// Objecten aan toevoegen
		lijst.add(new Persoon("Stef", "Collart", "Man", 27, 70, 1.8));
		lijst.add(new Persoon("Veerle", "Jorissen", "Vrouw", 59, 70, 1.70));
		lijst.add(new Persoon("Joske", "Vermeulen", "Man", 25, 50, 1.50));

		// De list alfabetisch sorteren
		// OPMERKING: Vanwege de compareTo in de klasse Persoon
		// wordt er eerst op gewicht gesorteerd en dan pas alfabetisch
		lijst.sort(Comparator.naturalOrder());

		// Elk element van de List lijst afdrukken
		lijst.forEach(s -> System.out.println(s));
	}

}
