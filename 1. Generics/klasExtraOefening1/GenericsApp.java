package klasExtraOefening1;

import java.util.ArrayList;
import java.util.List;

public class GenericsApp {
	private String namen = "Simon; Joris; Frederik; Sinasi; Yenthe; Glenn; Robin; Marthe; Bart; Samson; Gert";

	// List aanmaken om de namen in te plaatsen
	private List<Naam> listNaam = new ArrayList<Naam>();

	// de String namen splitsen bij elke puntkomma (;)
	private void parseNames() {
		String[] namenSplit = namen.split(";");

		// Elke naam (gesplits door bovenstaande code) in de listNaam toevoegen
		for (String namen : namenSplit) {
			listNaam.add(new Naam(namen));
		}
	}

	private void drukAlleNamenMetE() {
		int count = 0;
		// Alle namen overlopen
		for (Naam naam : listNaam) {
			// Kijken of de naam een E bevat, de counter omhoog brengen en de
			// naam afdrukken
			if (naam.getUpperVoornaam().contains("E")) {
				count++;
				System.out.println("Naam heeft een E: " + naam.getVoornaam());
			}
		}
		// De counter afdrukken
		System.out.println("Aantal gevonden namen: " + count);

	}

	private void drukLangsteNaam() {
		Naam langsteVoornaam = new Naam("");

		for (Naam namen : listNaam) {
			if (namen.getVoornaam().length() > langsteVoornaam.getVoornaam().length()) {
				langsteVoornaam = namen;
			}
		}

		System.out.println("De langste voornaam is: " + langsteVoornaam.getVoornaam());
	}

	private void drukAlleNamenMetEn() {
		int count = 0;
		// Alle namen overlopen
		for (Naam naam : listNaam) {
			// Kijken of de naam EN bevat, de counter omhoog brengen en de
			// naam afdrukken
			if (naam.getUpperVoornaam().contains("EN")) {
				count++;
				System.out.println("Naam heeft een EN: " + naam.getVoornaam());
			}
		}
		// De counter afdrukken
		System.out.println("Aantal gevonden namen: " + count);
	}

	public static void main(String[] args) {
		GenericsApp genericsApp = new GenericsApp();
		genericsApp.parseNames();

		genericsApp.drukAlleNamenMetE();
		System.out.println();

		genericsApp.drukAlleNamenMetEn();
		System.out.println();

		genericsApp.drukLangsteNaam();
	}

}
