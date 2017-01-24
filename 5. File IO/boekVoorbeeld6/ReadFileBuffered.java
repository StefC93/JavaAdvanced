package boekVoorbeeld6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFileBuffered {

	public static void main(String[] args) {
		// FileReader aanmaken en pad van het te lezen bestand meegeven
		// Deze FileReader in een BufferedReader steken
		// Dit dient om lijn per lijn uit te lezen ipv char per char
		try (FileReader file = new FileReader("5. File IO\\file3.txt");
				BufferedReader reader = new BufferedReader(file)) {
			String line = null;
			// Zolang niet null wordt terug gegeven, blijven lezen
			// null = geen lijn om te lezen (einde bestand)
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
// Verschillende manieren om lijn 16-17 te doen
// De manier van de lijn hieronder (36) is aangeraden
//try (BufferedReader reader = new BufferedReader(new FileReader("5. File IO\\file3.txt"))) {

/*Path path = Paths.get("5. File IO\\file3.txt");
try (BufferedReader reader = new BufferedReader(path)) { */