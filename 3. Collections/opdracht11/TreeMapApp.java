package opdracht11;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapApp {

	public static void main(String[] args) {
		SortedMap<String, Persoon> boomMap = new TreeMap<>();

		boomMap.put("StefCollart", new Persoon("Stef", "Collart", "Man", 23, 72, 180));
		boomMap.put("UwZuster", new Persoon("Uw", "Zuster", "Vrouw", 18, 80, 150));
		boomMap.put("SofieLangs-achter", new Persoon("Sofie", "Langs-achter", "Vrouw", 20, 55, 165));

		// Alle keys afdrukken
		boomMap.keySet().forEach(System.out::println);

		// Alle waardes(key+value) afdrukken met aangepast syso
		System.out.println();
		boomMap.forEach((k, v) -> System.out.println("Sleutel: " + k + " Waarde: " + v));

		// TBA (print één specifiek persoon af)
		System.out.println("\n" + boomMap.get("UwZuster"));

		System.out.println("\n" + boomMap.get(boomMap.firstKey()));
		System.out.println(boomMap.get(boomMap.lastKey()));

	}

}
