package opdracht4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.nio.file.attribute.DosFileAttributes;

public class BestandSchrijvenBuffered {

	public static void main(String[] args) {

		// Optioneel:
		Path path = Paths.get("5. File IO\\Tekstje.txt");
		// Optioneel: verander "5. File IO\\Tekstje.txt" naar path
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("5. File IO\\Tekstje.txt"))) {
			// Zin schrijven naar de BufferedWriter
			writer.write("Enkele zinnen om te testen");
			// newLine methode gebruiken om een nieuwe zin te beginnen
			writer.newLine();
			writer.write("Ik ben een testzin");
			writer.newLine();
			writer.write("Jeroen klopt op de deur");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
