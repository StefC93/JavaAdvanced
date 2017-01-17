package opdracht1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LijstString {

	public static void main(String[] args) {
		// Arraylist en scanner aanmaken
		List<String> lijst = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		// String aanmaken waar de woorden in omgekeerde volgorde in
		// terechtkomen
		String omgekeerd = "";

		System.out.println("Voer een zin in: ");
		// Input vragen
		String zin = sc.nextLine();
		// De input splitsen en in een String array steken
		String[] splitted = zin.split(" ");

		// De scanner weer sluiten
		sc.close();
		
		// De string Array overlopen en elk element aan de Arraylist toevoegen
		for (String el : splitted) {
			lijst.add(el);
		}
		// Afdrukken hoeveel woorden (elementen) er in de Arraylist zitten
		System.out.println("Er zitten " + lijst.size() + " woorden in de zin.");
		// De Arraylist omdraaien
		Collections.reverse(lijst);
		// De omgedraaide Arraylist overlopen en elk element toevoegen aan de lege string
		for (String el : lijst) {
			omgekeerd = omgekeerd + el + " ";
		}
		// De string met de woorden in omgekeerde volgorde afdrukken
		System.out.println("De zin in omgekeerde volgorde: " + omgekeerd);

	}

}
