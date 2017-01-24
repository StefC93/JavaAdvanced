package boekVoorbeeld4;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {

		// Werkt niet vanwege gebruik IDE (pagina 126 onderaan)
		Console console = System.console();
		if (console == null)
			return;

		String name = console.readLine("Name: ");
		console.printf("Your name %s: \n", name);
		char[] password = console.readPassword("Password: ");
		console.printf("Your password is %s ", new String(password));
	}

}
