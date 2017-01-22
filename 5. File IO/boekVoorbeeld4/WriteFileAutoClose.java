package boekVoorbeeld4;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteFileAutoClose {

	public static void main(String[] args) {

		// Op deze manier implementeert FileWriter de interface AutoCloseable
		// die automatisch wordt opgeroepen na het verlaten van de try-blok
		try (FileWriter file1 = new FileWriter("5. File IO\\file44.txt");
				FileWriter file2 = new FileWriter("5. File IO\\file55.txt")) {
			// Tekst naar het bestand schrijven (tekst komt achter elkaar)
			file1.write("Hello World");
			file2.write("Hello World");
		} catch (IOException e) {
			System.out.println("Oops, foutje!");
		}

		// Het is ook mogelijk om een File object te maken met de Path interface
		// door gebruik te maken van de .toFile() methode
		
/*		Path path = Paths.get("5. File IO\\file44.txt");
		try (FileWriter file1 = new FileWriter(path.toFile());
				FileWriter file2 = new FileWriter("5. File IO\\file55.txt")) {
			// Tekst naar het bestand schrijven (tekst komt achter elkaar)
			file1.write("Hello World");
			file2.write("Hello World");
		} catch (IOException e) {
			System.out.println("Oops, foutje!");
		}*/
	}

}
