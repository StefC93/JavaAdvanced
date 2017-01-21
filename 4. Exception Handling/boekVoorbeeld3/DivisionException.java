package boekVoorbeeld3;

import java.util.Scanner;

public class DivisionException {

	public static void main(String[] args) {

		int numerator = 0;
		int denominator = 0;

		Scanner keyboard = new Scanner(System.in);

		try {

			System.out.println("Te delen getal: ");
			numerator = Integer.parseInt(keyboard.next());

			System.out.println("Deler: ");
			denominator = Integer.parseInt(keyboard.next());

			int division = numerator / denominator;

			System.out.println(numerator + "/" + denominator + " = " + division);
			// Exception is de opperbaas klasse van de exceptions en vangt alle
			// mogelijke exceptions op. Dit is echter niet aan te raden
			// omdat je dan niet weet wat voor exception er wordt gegooid
			// en wat er dus misgaat
		} catch (Exception e) {
			System.out.println("Ongeldige invoer!");
			e.getClass(); // Met de getClass methode kan je toch achterhalen
							// welke exception er wordt gegooid
			e.printStackTrace();
		}
		keyboard.close();
	}
}