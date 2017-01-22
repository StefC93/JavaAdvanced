package boekVoorbeeld1;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileLezen {

	public static void main(String[] args) {

		// Steekt het pad in p1 waarop men dan kan verder bouwen
		Path p1 = Paths.get("C:\\Users\\Stef\\git\\JavaAdvanced");
		// System.out.println(p1);

		// Binnen het opgegeven pad van p1 gaat hij verder zoeken naar
		// 5. File IO en eraan vastplakken en deze waarde in p2 steken
		Path p2 = p1.resolve("5. File IO");

		// Binnen het opgegeven pad van p2 gaat hij verder zoeken naar
		// file1.txt en eraan vastplakken en deze waarde in p3 steken
		Path p3 = p2.resolve("file1.txt");

		// Uitprinten wat er in p3 steekt (p1+p2+p3)
		System.out.println(p3);

		// Het pad van een file in de variabele steken. Aangezien de file in
		// dezelfde hoofdmap zit als de package moet men enkel de hoofdmap
		// opgeven en de onderliggende file (relative path)
		// OPMERKING: Er wordt niet gecontroleerd of het bestand bestaat
		Path p4 = Paths.get("5. file io\\file3.txt");
		// Het volledige absolute pad uitprinten
		System.out.println(p4.toAbsolutePath());

		try {
			// Het volledige absolute pad uitprinten zoals het in het OS
			// voorkomt. Er zijn namelijk verschillen voor Windows/Linux
			System.out.println(p4.toRealPath());
		} catch (IOException e) {
			// try/catch bijvoegen aangezien er bij .toRealPath wordt
			// gecontroleerd of het bestand aanwezig is
			System.out.println("Het bestand bestaat niet!");
			e.printStackTrace();
		}

		Path p5 = Paths.get("C:\\Users\\Stef\\git\\JavaAdvanced\\5. file io\\file1.txt");
		Path p6 = Paths.get("C:\\Users\\Stef\\git\\JavaAdvanced\\5. file io\\subfolder\\file4.txt");
		// Zoekt het verschil in paden van p5 en p6 tot aan een
		// gemeenschappelijke folder
		Path p7 = p5.relativize(p6);
		System.out.println(p7);

		// Alle basismappen afdrukken
		try {
			FileSystem fs = FileSystems.getDefault();
			System.out.println("Root map: " + fs.getSeparator());
			for (Path p : fs.getRootDirectories()) {
				System.out.println(p);
			}
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
	}

}
