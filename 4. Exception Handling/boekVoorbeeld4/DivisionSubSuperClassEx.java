package boekVoorbeeld4;

import java.util.Scanner;

public class DivisionSubSuperClassEx {

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
			// Je kan ondanks Superklasse exception ook nog een exception
			// toevoegen van een subklasse. Deze moet dan wel voor de
			// superklasse komen
		} catch (ArithmeticException e) {
			System.out.println("Delen door 0 is niet mogelijk!");
		} catch (Exception e) {
			System.out.println("Ongeldige invoer!");
			e.getClass();
			e.printStackTrace();
		}
		keyboard.close();
	}
}