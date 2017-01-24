package boekVoorbeeld7;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;

public class SerialisableWriteObjectApp {

	public static void main(String[] args) {
		
		// Twee objecten aanmaken
		String text = new String("Beetje tekst");
		LocalDateTime date = LocalDateTime.now();

		// FileOutputStream object aanmaken om een bestand te creeëren
		// ObjectOutputStream aanmaken om dit bestand te serialiseren
		try (FileOutputStream file = new FileOutputStream("5. File IO\\Bestand.ser");
				ObjectOutputStream out = new ObjectOutputStream(file)) {

			// De twee objecten toevoegen
			out.writeObject(text);
			out.writeObject(date);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
