package opdracht3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BestandLezen {

	public static void main(String[] args) {

		try (FileReader file = new FileReader("5. File IO\\subfolder\\file1_copy.txt")) {
			int character;
			while ((character = file.read()) != -1) {
				System.out.println((char) character);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
