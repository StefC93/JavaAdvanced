package opdracht4;

import java.util.Scanner;

public class Division {

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

			// Gemeenschappelijke superklasse
/*		} catch (RuntimeException e) {
			System.out.println("Ongeldige invoer!");
			e.printStackTrace();*/
			// Meervoudige exception handler
		} catch (ArithmeticException|NumberFormatException e) {
			System.out.println("Woops, something went wrong!");
		}
		keyboard.close();

	}

}