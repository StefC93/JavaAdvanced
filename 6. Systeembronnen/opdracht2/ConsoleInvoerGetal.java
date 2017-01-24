package opdracht2;

import java.io.Console;

public class ConsoleInvoerGetal {

	public static void main(String[] args) {

		Console console = System.console();
		if (console == null)
			return;

		String getal = console.readLine("Voer een geheel getal in: ");
		double kwadraat = Math.pow(getal.indexOf(getal), 2);
		console.printf("Het ingevoerde getal", getal);
		System.out.println("Het kwadraat van het ingevoerde getal: " + kwadraat);

	}

}
