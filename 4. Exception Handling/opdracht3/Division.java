package opdracht3;

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

		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("Delen door 0 is niet mogelijk!");
			// System.out.println(e.getMessage());
			e.printStackTrace();
		}
		keyboard.close();

	}

}