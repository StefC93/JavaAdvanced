package opdracht6;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Maternity {

	public static void main(String[] args) {

		// LocalDate objecten maken voor de geboortedatum
		LocalDate gbStef = LocalDate.parse("1993-03-05");
		LocalDate gbJos = LocalDate.parse("1967-09-18");

		// De huidige datum opvragen
		Calendar today = Calendar.getInstance();
		Date vandaag = today.getTime();

		// Person objecten aanmaken
		Person p1 = new Person("Stef", "Collart", gbStef);
		Person p2 = new Person("Jos", "Duif", gbJos);

		// Datum en objecten uitprinten ter controle
		System.out.println(vandaag);
		System.out.println(p1);
		System.out.println(p2);

		// FileOutputStream object aanmaken om een bestand te creeëren
		// ObjectOutputStream aanmaken om dit bestand te serialiseren
		try (FileOutputStream file = new FileOutputStream("5. File IO\\opdracht6\\Personen.txt");
				ObjectOutputStream out = new ObjectOutputStream(file)) {

			// De twee objecten toevoegen
			out.writeObject(p1);
			out.writeObject(p2);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
