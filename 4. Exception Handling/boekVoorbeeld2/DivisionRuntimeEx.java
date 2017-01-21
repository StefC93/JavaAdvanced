package boekVoorbeeld2;

import java.util.Scanner;

public class DivisionRuntimeEx {

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
			// RuntimeException is de superklasse van de exceptions
			// in voorbeeld 1
		} catch (RuntimeException e) {
			System.out.println("Ongeldige invoer!");
			e.printStackTrace();
		}
		keyboard.close();
	}
}