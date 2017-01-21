package opdracht1;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {

		// Genereer een exception door een non-integer waarde te geven
		// wanneer een integer gevraagd wordt (numerator & denominator)
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Te delen getal: ");
		int numerator = Integer.parseInt(keyboard.next());

		System.out.println("Deler: ");
		int denominator = Integer.parseInt(keyboard.next());

		int division = numerator / denominator;
		keyboard.close();

		System.out.println(numerator + "/" + denominator + " = " + division);
	}

}
