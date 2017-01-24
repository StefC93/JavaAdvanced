package opdracht2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.nio.file.attribute.DosFileAttributes;

public class BestandSchrijven {

	public static void main(String[] args) {

		Path path = Paths.get("5. File IO\\Tekstje.txt");
		try (FileWriter file1 = new FileWriter(path.toFile())) {

			file1.write("Enkele zinnen om te testen");
			file1.write("Ik ben een testzin");
			file1.write("Jeroen klopt op de deur");

			DosFileAttributes attrs = Files.readAttributes(path, DosFileAttributes.class);

			System.out.println(attrs.isReadOnly());
			
			
			// read only maken!
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
