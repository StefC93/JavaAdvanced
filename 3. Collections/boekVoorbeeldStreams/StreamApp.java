package boekVoorbeeldStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamApp {

	public static void main(String[] args) {

		List<String> words = new ArrayList<>();

		words.add("Hey");
		words.add("this");
		words.add("is");
		words.add("an");
		words.add("example");
		words.add("of");
		words.add("streams");

		System.out.println("Afdruk van de List: ");
		for (String s : words) {
			System.out.println(s);
		}

		// Op de List words worden de elementen gestreamed
		// (geen functie) naar een forEach methode die ze dan afdrukt
		System.out.println("\nAfdruk van lege stream: ");
		words.stream().forEach(s -> System.out.println(s));

		// Op de stream wordt een filter toegepast
		// die enkel de woorden met een letter 'e' afdrukt
		System.out.println("\nWoorden met een 'e': ");
		words.stream().filter(s -> s.contains("e")).forEach(System.out::println);

		// Op de stream wordt een filter toegepast
		// die enkel worden afdrukt die langer zijn dan 3 letters
		// op deze filter wordt dan nogmaals een filter toegepast
		// voor worden die een 'e' bevatten
		// OPMERKING: filters kan men oneindig vaak aan elkaar koppelen
		System.out.println("\nWoorden langer dan 3 letters en met een 'e': ");
		words.stream().filter(s -> s.length() > 3).filter(s -> s.contains("e")).forEach(System.out::println);

		// Op de stream wordt een mapping toegepast die elk woord omzet
		// naar een integer waardoor je dus de lengte van elk woord krijgt
		System.out.println("\nLengte van het woord: ");
		words.stream().mapToInt(s -> s.length()).forEach(System.out::println);

		// Op de stream wordt een mapping toegepast die
		// alles omzet naar hoofdletters
		System.out.println("\nWoorden worden naar uppercase gezet: ");
		words.stream().map(String::toUpperCase).forEach(System.out::println);

		// Het berekenen van het totaal aantal letters van
		// alle woorden in de List
		System.out.println("\nHet totale aantal letters: ");
		int length = words.stream().mapToInt(String::length).sum();
		System.out.println(length);

		// De eerste parameter van de reduce methode is de initiële beginwaarde
		// String t is het tussenresultaat & String u het te behandelende object
		// Alle objecten worden dus steeds aan elkaar geplakt waardoor de
		// spaties wegvallen
		System.out.println("\nAlle woorden aan elkaar geplakt: ");
		String total = words.stream().reduce("", (String t, String u) -> t + u);
		System.out.println(total);

		// Met de methode .collect kan men de gefilterde elementen
		// in een nieuwe List steken
		System.out.println("\nAlle woorden kleiner dan 3 letters: ");
		List<String> shortWords = words.stream().filter(s -> s.length() < 3).collect(Collectors.toList());
		shortWords.stream().forEach(System.out::println);
	}

}
