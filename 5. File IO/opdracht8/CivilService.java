package opdracht8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CivilService {

	public static void main(String[] args) {

		try (FileInputStream file = new FileInputStream("5. File IO\\opdracht8\\Personen.txt");
				ObjectInputStream in = new ObjectInputStream(file)) {

			Person persoon1 = (Person) in.readObject();
			Person persoon2 = (Person) in.readObject();

			// System.in.read();

			System.out.println(persoon1);
			System.out.println(persoon2);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}