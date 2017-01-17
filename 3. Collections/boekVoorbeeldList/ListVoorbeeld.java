package boekVoorbeeldList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListVoorbeeld {

	public static void main(String[] args) {
		// Lijst aanmaken
		List<String> list = new ArrayList<String>();

		// Elementen toevoegen aan de lijst
		list.add("dit");
		list.add("is");
		list.add("een");
		list.add("test");

		/*
		 * //Met de methode "iterator()" de lijst doorlopen en afprinten
		 * Iterator<String> it = list.iterator(); while (it.hasNext()) {
		 * //Kijken of er nog een volgende element is in de lijst
		 * System.out.println(it.next()); //Volgende element afdrukken }
		 */

		/*
		 * //Met een for each-lus de lijst doorlopen (maakt in de achtergrond
		 * gebruik van de iterator methode) for (String s : list) {
		 * System.out.println(s); }
		 */

		/*
		 * // Met een lambda expressie de lijst doorlopen list.forEach(s ->
		 * System.out.println(s));
		 */

	}

}
