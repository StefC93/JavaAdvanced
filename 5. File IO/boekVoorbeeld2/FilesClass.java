package boekVoorbeeld2;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.DosFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class FilesClass {

	public static void main(String[] args) {

		try {
			// Path definiëren
			Path path = Paths.get("C:\\Users\\Stef\\git\\JavaAdvanced\\5. File IO\\subfolder\\file1.txt");
			
			// Parent directory aanmaken
			Files.createDirectories(path.getParent());

			// Aanmaken indien het pad niet bestaat
			if (Files.notExists(path)) {
				Files.createFile(path);
				System.out.println("File created!");
			} else {
				System.out.println("File already exists!");
			}

			// Tekst toevoegen aan het bestand
			List<String> lines = new ArrayList<>();

			lines.add("Hello");
			lines.add("World");

			Files.write(path, lines, Charset.defaultCharset(), StandardOpenOption.APPEND);

			// Bytes toevoegen aan het bestand
			byte[] bytes = { 1, 2, 3 };
			Files.write(path, bytes, StandardOpenOption.APPEND);

			byte[] bytes2 = Files.readAllBytes(path);
			System.out.println("Bytes uitlezen: " + bytes2);

			// Eigenschappen van het bestand ophalen
			DosFileAttributes attrs = Files.readAttributes(path, DosFileAttributes.class);

			System.out.println("Bestandsgrootte: " + attrs.size() + " bytes");
			System.out.println("Aangemaakt op: " + attrs.creationTime());
			System.out.println("Laatst benaderd: " + attrs.lastAccessTime());
			System.out.println("Laatst aangepast: " + attrs.lastModifiedTime());
			System.out.println("Gearchiveerd? " + attrs.isArchive());
			System.out.println("Verborgen bestand? " + attrs.isHidden());
			System.out.println("Read only? " + attrs.isReadOnly());

			// Alle lijnen van het bestand uitlezen
			lines = Files.readAllLines(path, Charset.defaultCharset());

			System.out.println("\nLijn per lijn: ");
			for (String l : lines) {
				System.out.println(l);
			}

			// Bestand kopiëren
			Path path2 = Paths.get("C:\\Users\\Stef\\git\\JavaAdvanced\\5. File IO\\subfolder\\file1_copy.txt");
			Files.copy(path, path2, StandardCopyOption.REPLACE_EXISTING);

			// Bestand verwijderen
			Files.deleteIfExists(path);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}