package opdracht9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class StreamOefening {

	public static void main(String[] args) {
		List<Persoon> lijst = new ArrayList<>();

		lijst.add(new Persoon("Stef", "Collart", "Man", 23, 72, 180));
		lijst.add(new Persoon("Jos", "Vermeulen", "Man", 68, 85, 178));
		lijst.add(new Persoon("Lien", "Shpijt", "Vrouw", 17, 50, 160));
		lijst.add(new Persoon("Roger", "Donck", "Man", 66, 80, 170));
		lijst.add(new Persoon("Femke", "Zusters", "Vrouw", 20, 67, 175));

		System.out.println("Alle personen in de lijst: ");
		lijst.stream().forEach(System.out::println);

		System.out.println("\nEnkel vrouwen: ");
		lijst.stream().filter(s -> "Vrouw".equals(s.getGender())).forEach(System.out::println);

		System.out.println("\nPersonen ouder dan 21: ");
		lijst.stream().filter(s -> s.getAge() >= 21).forEach(System.out::println);

		System.out.println("\nPersonen tussen de 45 en 75 kilo: ");
		lijst.stream().filter(s -> s.getWeight() >= 45).filter(s -> s.getWeight() <= 75).forEach(System.out::println);

		System.out.println("\nPersonen ouder dan 65 en gewicht boven de 82kg: ");
		lijst.stream().filter(s -> s.getAge() > 65).filter(s -> s.getWeight() > 82).forEach(System.out::println);

		System.out.println("\nEnkel de leeftijden van alle personen: ");
		Map<Object, List<Persoon>> enkelLeeftijd = lijst.stream().collect(Collectors.groupingBy(s -> s.getAge()));
		enkelLeeftijd.forEach((leeftijd, s) -> System.out.format("%s \n", leeftijd));

		System.out.println("\nDe voor en achternaam van iedere persoon: ");
		String voorNaam = lijst.stream().map(s -> s.getFirstName()).reduce("", (String t, String u) -> t + "\n" + u);
		String achterNaam = lijst.stream().map(s -> s.getLastName()).reduce("", (String t, String u) -> t + "\n" + u);
		String naam = voorNaam + achterNaam;
		System.out.println(naam);
		//Map<Object, List<Persoon>> voorNaam = lijst.stream().collect(Collectors.groupingBy(s -> s.getFirstName()));
		//Map<Object, List<Persoon>> achterNaam = lijst.stream().collect(Collectors.groupingBy(s -> s.getLastName()));
		//voorNaam.forEach((voor, s) -> System.out.format("%s \n", voor));
		//achterNaam.forEach((achter, s) -> System.out.format("%s \n", achter));

		System.out.println("\nHet gewicht van iedere persoon: ");
		Map<Object, List<Persoon>> gewicht = lijst.stream().collect(Collectors.groupingBy(s -> s.getAge()));
		gewicht.forEach((kilo, s) -> System.out.format("%s \n", kilo));

		System.out.println("\nMinimum, maximum en gemiddelde van het gewicht: ");
		OptionalDouble minimum = lijst.stream().mapToDouble(s -> s.getWeight()).min();
		System.out.println("Minimum gewicht: " + minimum.getAsDouble());
		OptionalDouble maximum = lijst.stream().mapToDouble(s -> s.getWeight()).max();
		System.out.println("Maximum gewicht: " + maximum.getAsDouble());
		OptionalDouble gemiddelde = lijst.stream().mapToDouble(s -> s.getWeight()).average();
		System.out.println("Gemiddelde gewicht: " + gemiddelde.getAsDouble());

		System.out.println("\nPersonen onder de 18: ");
		List<Persoon> onder18 = lijst.stream().filter(s -> s.getAge() < 18).collect(Collectors.toList());
		onder18.stream().forEach(System.out::println);
	}

}
