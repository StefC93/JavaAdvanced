package opdracht7;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class IntrinsiekSorteren {

	public static void main(String[] args) {
		
		// TreeSet aanmaken
		//Set<Persoon> sorteren = new TreeSet<>();
		
		// Treeset met anonieme geneste klasse die gaat sorteren op gewicht
/*		Set<Persoon> sorteren = new TreeSet<>(new Comparator<Persoon>() {
			@Override
			public int compare(opdracht7.Persoon o1, opdracht7.Persoon o2) {
				return (int) (o1.getWeight() - o2.getWeight());
			}
		});*/
		
		// Hetzelfde als bovenstaand (regel 14-20) maar dan met lambda expressie
		Set<Persoon> sorteren = new TreeSet<>(Comparator.comparingDouble(w -> w.getWeight()));

		sorteren.add(new Persoon("Jorissen", "Veerle", "Vrouw", 59, 70, 1.70));
		sorteren.add(new Persoon("Vermeulen", "Joske", "Man", 25, 50, 1.50));
		sorteren.add(new Persoon("Collart", "Stef", "Man", 23, 72, 1.80));

		// Vanwege de compareTo methode in de klasse Persoon
		// worden de elementen gesorteerd op leeftijd
		sorteren.forEach(s -> System.out.println(s));

	}

}
