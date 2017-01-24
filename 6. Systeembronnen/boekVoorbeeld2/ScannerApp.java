package boekVoorbeeld2;

import java.util.Scanner;

public class ScannerApp {

	public static void main(String[] args) {

		// Scanner is een superklasse van Input & Buffered
		// Is dus een combo van beide
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Please enter your name: ");
			// Lees volgende (eerste) regel die ingevoerd wordt
			String name = scanner.next();
			System.out.println("Please enter your age: ");
			// Lees volgende regel die ingevoerd wordt met extra controle erbij
			// of het een integer is of niet. Indien dit niet het geval is wordt er een exception gegooid
			int age = scanner.nextInt();
			System.out.printf("Hello %s, you are %s years old.", name, age);
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
