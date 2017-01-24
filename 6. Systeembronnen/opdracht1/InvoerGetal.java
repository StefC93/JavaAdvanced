package opdracht1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InvoerGetal {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Voer een geheel getal in: ");
			int getal = sc.nextInt();
			double kwadraat = Math.pow(getal, 2);
			System.out.println("Het ingevoerde getal: " + getal);
			System.out.println("Het kwadraat van het ingevoerde getal: " + kwadraat);
		} catch (InputMismatchException e) {
			System.out.println("Oops, je hebt geen geheel getal ingevoerd!");
		}

	}

}
