package boekVoorbeeldHashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {

	public static void main(String[] args) {

		// Map aanmaken en key/value pairs aan toekennen
		Map<String, Integer> ingredients = new HashMap<>();
		ingredients.put("Potatoes", 5);
		ingredients.put("Carrots", 4);
		ingredients.put("Beans", 2);
		ingredients.put("Chicken", 1);

		// Één enkel ingrediënt uitprinten aan de hand van een key
		System.out.println(ingredients.get("Chicken"));

		// Alle ingrediënten uitprinten
		for (String s : ingredients.keySet())
			System.out.println(s + ": " + ingredients.get(s));

		// Alle ingrediënten overlopen met een lambda expressie
		ingredients.forEach((k, v) -> System.out.println(k + ": " + v));
	}

}
