package boekVoorbeeld3;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {

		// FileWriter met als waarde null om een controle tegen te bouwen
		FileWriter file = null;

		try {
			// Declareren waar het bestand moet geschreven worden
			file = new FileWriter("5. File IO\\file55.txt");

			// Tekst naar het bestand schrijven (tekst komt achter elkaar)
			file.write("Hello");
			file.write("World");
		} catch (IOException e) {
			System.out.println("Oops, foutje!");
		} finally {
			try {
				// Als de originele file waarde (null) is aangepast
				// dan sluiten we de stream naar het bestand
				if (file != null)
					file.close();
			} catch (IOException e2) {
				System.out.println("Aaaaah, het loopt helemaal fout!");
			}
		}
	}

}
