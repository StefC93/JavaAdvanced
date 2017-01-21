package boekVoorbeeldComparable;

import java.util.SortedSet;
import java.util.TreeSet;

public class BoxSortingApp {

	public static void main(String[] args) {

		// SortedSet<Box> boxes = new TreeSet<>();

		// Op deze manier gebruik je de comparator van de klasse die meegegzven
		// wordt ipv de comparator in de normale Box-klasse
		SortedSet<Box> boxes = new TreeSet<>(new BoxLengthComparator());

		boxes.add(new Box(3, 5, 2));
		boxes.add(new Box(4, 3, 7));
		boxes.add(new Box(1, 2, 2));

		for (Box b : boxes) {
			System.out.println(b);
		}
	}

}
