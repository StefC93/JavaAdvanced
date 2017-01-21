package opdracht3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Loterij {

	public static void main(String[] args) {
		// Objecten aanmaken voor random nummers te genereren + scanner voor
		// user input
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		// (Hash)Set's aanmaken voor de automatisch gegenereerde nummers
		// en voor die van de user input
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new LinkedHashSet<>();

		// Willekeurige nummers tussen 1-45 genereren
		int nummer1 = rand.nextInt(45) + 1;
		int nummer2 = rand.nextInt(45) + 1;
		int nummer3 = rand.nextInt(45) + 1;
		int nummer4 = rand.nextInt(45) + 1;
		int nummer5 = rand.nextInt(45) + 1;
		int nummer6 = rand.nextInt(45) + 1;
		// Twee extra nummers voorzien indien er duplicaten zijn bij de
		// originele zes nummers
		int nummerExtra1 = rand.nextInt(45) + 1;
		int nummerExtra2 = rand.nextInt(45) + 1;

		// Nummers toevoegen aan de (Hash)Set
		set1.add(nummer1);
		set1.add(nummer2);
		set1.add(nummer3);
		set1.add(nummer4);
		set1.add(nummer5);
		set1.add(nummer6);

		// Indien er een duplicaat is (en men dus maar 5 nummers heeft)
		// dan wordt er het eerste extra nummer toegevoegd
		if (set1.size() < 6) {
			set1.add(nummerExtra1);
			// Tweede extra nummer wordt toegevoegd indien men nog altijd geen
			// 6 cijfers heeft wegens duplicaten
			if (set1.size() < 6) {
				set1.add(nummerExtra2);
			}
		}

		// Zes unieke cijfers vragen aan de user en deze is een aparte
		// (Hash)Set steken
		for (int i = 0; i < 6; i++) {
			System.out.println("Voer een uniek cijfer in tussen 1 en 45 (" + (i + 1) + "/6):");
			int getal = sc.nextInt();
			set2.add(getal);
		}
		sc.close();

		System.out.println("De lotto trekking van vandaag is: " + set1);
		System.out.println("Uw cijfers zijn: " + set2);

		// set1 met set2 vergelijken waarbij in set1 de nummers worden
		// opgeslagen die zowel in set1 als set2 voorkomen.
		set1.retainAll(set2);

		if (set1.size() > 0) {
			System.out.println("U heeft " + set1.size() + " nummer(s) juist! De/het overeenkomende cijfer(s): " + set1);
		} else {
			System.out.println("Helaas! U heeft geen enkel cijfer correct. Volgende keer beter!");
		}
	}
}
