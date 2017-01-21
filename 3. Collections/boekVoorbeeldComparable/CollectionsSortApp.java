package boekVoorbeeldComparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionsSortApp {

	public static void main(String[] args) {

		// List aanmaken en elementen toevoegen
		List<String> list = new ArrayList<>();
		list.add("This");
		list.add("is");
		list.add("an");
		list.add("example");
		list.add("about");
		list.add("Collections");

		// De list overlopen en elk element afdrukken
		for (String s : list) {
			System.out.println(s);
		}

		// De list overlopen gesorteerd op alfabet
		// Waarbij hoofdletters voorop komen
		System.out.println();
		list.sort(Comparator.naturalOrder());
		list.forEach(s -> System.out.println(s));

		// De list overlopen en sorteren op String lengte
		System.out.println();
		list.sort(Comparator.comparingInt(String::length));
		list.forEach(s -> System.out.println(s));
	}

}
