package opdracht2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetInteger {

	public static void main(String[] args) {
		// variabelen declareren
		int som = 0;
		double gemiddelde = 0;

		//Omdat we gebruik maken van een (Hash)Set worden eventuele duplicaten
		//niet aan de lijst toegevoegd
		Set<Integer> lijst = new HashSet<>();
		Scanner sc = new Scanner(System.in);

		// Scanner en for loop gebruiken om 3 getallen op te vragen en toevoegen
		// aan de ArrayList
		for (int i = 0; i < 3; i++) {
			System.out.println("Voer een cijfer in (" + (i + 1) + "/3):");
			int getal = sc.nextInt();
			lijst.add(getal);
		}
		sc.close();
		
		// De ingevoerde getallen afdrukken
		System.out.print("De ingegeven getallen zijn: ");
		for (int i : lijst) {
			System.out.print(i + "\t");
			som += i; // Alle getallen optellen
		}
		
		// Gemiddelde berekenen
		gemiddelde = som / lijst.size();
		
		System.out.println();
		System.out.println("De som van de ingegeven getallen is: " + som);
		System.out.println("Het gemiddelde bedraagt: " + gemiddelde);
	}

}
