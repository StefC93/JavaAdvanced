package boekVoorbeeld7;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.time.LocalDateTime;

public class SerialisableReadObjectApp {

	public static void main(String[] args) {

		// FileInputStream object aanmaken om het bestand te lezen
		// OnjectInputStream object aanmaken zodat de objecten in het bestand
		// gelezen kunnen worden
		try (FileInputStream file = new FileInputStream("5. File IO\\Bestand.ser");
				ObjectInputStream in = new ObjectInputStream(file)) {
			// String object lezen en casten naar String
			String text = (String) in.readObject();
			// LocalDateTime object lezen en casten naar LocalDateTime
			LocalDateTime date = (LocalDateTime) in.readObject();

			// Beide variabele uitprinten
			System.out.println(text);
			System.out.format("%td/%<tm/%<ty %<tY %<tH:%<tM:%<tS%n", date);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
