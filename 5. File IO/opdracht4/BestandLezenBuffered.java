package opdracht4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BestandLezenBuffered {

	public static void main(String[] args) {

		try (BufferedReader reader = new BufferedReader(new FileReader("5. File IO\\subfolder\\file1_copy.txt"))) {
			String line = null;
			while (((line = reader.readLine())) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
