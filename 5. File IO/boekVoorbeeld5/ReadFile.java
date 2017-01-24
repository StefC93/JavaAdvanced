package boekVoorbeeld5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		// FileReader aanmaken en pad van het te lezen bestand meegeven
		try (FileReader file = new FileReader("5. File IO\\file3.txt")) {
			int character;
			// Zolang er geen -1 wordt terug gegeven, blijven lezen
			// -1 = geen character om te lezen (einde bestand)
			while ((character = file.read()) != -1) {
				// Casten naar char, anders krijg je int waardes terug
				System.out.println((char) character);
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
