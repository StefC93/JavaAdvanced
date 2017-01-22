package opdracht1;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;
import java.util.ArrayList;
import java.util.List;

public class MapsAndFiles {

	public static void main(String[] args) {

		try {
			Path path = Paths.get("C:\\Users\\Stef\\git\\JavaAdvanced\\5. File IO\\subfolder2\\testfile.txt");

			Files.createDirectories(path.getParent());

			if (Files.notExists(path)) {
				Files.createFile(path);
				System.out.println("File created!");
			} else {
				System.out.println("File already exists!");
			}

			List<String> lines = new ArrayList<>();

			lines.add("Enkele zinnen om te testen");
			lines.add("Ik ben een testzin");
			lines.add("Jeroen klopt op de deur");

			Files.write(path, lines, Charset.defaultCharset(), StandardOpenOption.APPEND);

			DosFileAttributes attrs = Files.readAttributes(path, DosFileAttributes.class);
			System.out.println("Bestandsgrootte: " + attrs.size() + " bytes");
			System.out.println("Aangemaakt op: " + attrs.creationTime());
			System.out.println("Laatst benaderd: " + attrs.lastAccessTime());
			System.out.println("Laatst aangepast: " + attrs.lastModifiedTime());
			System.out.println("Gearchiveerd? " + attrs.isArchive());
			System.out.println("Verborgen bestand? " + attrs.isHidden());
			System.out.println("Read only? " + attrs.isReadOnly());

			lines = Files.readAllLines(path, Charset.defaultCharset());

			System.out.println("\nLijn per lijn: ");
			for (String l : lines) {
				System.out.println(l);
			}

			// Eigenaar van het bestand ophalen en afdrukken
			FileOwnerAttributeView ownerAttributeView = Files.getFileAttributeView(path, FileOwnerAttributeView.class);
			UserPrincipal owner = ownerAttributeView.getOwner();
			System.out.println("\nBestandseigenaar: " + owner.getName());

			// srcFile: het huidige bestand
//			File srcFile = path.toFile();
			// destFile: naam en locatie van het bestand dat van naam (en evt.
			// locatie) is veranderd
//			File destFile = new File("5. File IO\\subfolder2\\testje.txt");
//			boolean rename = srcFile.renameTo(destFile);
//			System.out.println(rename);
			
			// Move methode
			Path destination = FileSystems.getDefault().getPath("5. File IO\\testje.txt");
			Files.move(path, destination, StandardCopyOption.REPLACE_EXISTING);

		} catch (IOException e) {
			System.out.println("Sorry, something went wrong!");
			e.printStackTrace();
		}

	}

}
