package boekVoorbeeld3;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class ErrorApp {

	public static void main(String[] args) {

		try {
			// PrintStream waarbij een FileOutputStream wordt meegegeven om een
			// bestand aan te maken
			PrintStream logstream = new PrintStream(
					new FileOutputStream("6. Systeembronnen\\boekVoorbeeld3\\Logfile.txt", true));
			// Alle error messages worden naar logstream doorgestuurd in plaats
			// van dat deze worden afgeprint in de console
			System.setErr(logstream);
		} catch (Exception e) {
			System.out.println("Oops, foutje!");
			System.out.println(e.getMessage());
		}
		// Hello World komt in de console terecht
		System.out.println("Hello World");
		// De error message komt niet in de console terecht maar wordt
		// doorgestuurd en komt in het bestand terecht dat is toegewezen aan
		// logstream
		System.err.println("This is an error message");
	}

}
