package boekVoorbeeldSet;

import java.util.HashSet;
import java.util.Set;

public class SetVoorbeeld {

	public static void main(String[] args) {
		
		//HashSet aanmaken
		Set<String> setje = new HashSet<>();
		
		//2 verschillende waardes toevoegen aan de HashSet
		setje.add("Hello");
		setje.add("World");
		// setje.add("Hello"); //Als je een element toevoegd dat alreeds in de HashSet zit wordt dit genegeerd
		//Set staat geen duplicaten toe
		
		//De HashSet overlopen en elk element afdrukken
		for (String el : setje) {
			System.out.println(el);
		}
		
		//HashSet aanmaken
		Set<String> texts = new HashSet<>();
		
		//2 identieke waardes toevoegen aan de HashSet
		texts.add("Hello World");
		texts.add("Hello World");
		
		//De grootte van de HashSet opvragen. Deze geeft 1 terug, dat betekent dus
		//dat de 2de "Hello World" niet in de HashSet is opgenomen omdat deze alreeds
		//bestaat in de HashSet (geen duplicaten!)
		System.out.println("De grootte van de HashSet is: " + texts.size());
	}

}
