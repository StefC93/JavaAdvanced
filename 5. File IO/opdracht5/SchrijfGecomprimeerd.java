package opdracht5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.zip.DeflaterInputStream;

public class SchrijfGecomprimeerd {

	public static void main(String[] args) {

		/*
		 * Path path = Paths.
		 * get("C:\\Users\\Stef\\git\\JavaAdvanced\\5. File IO\\Tekstje.txt");
		 * try (DeflaterOutputStream deflate = new DeflaterOutputStream(new
		 * FileOutputStream("5. File IO\\Tekstje.zip")); BufferedWriter writer =
		 * new BufferedWriter(new FileWriter(path.toFile()))) {
		 * 
		 * writer.write("Enkele zinnen om te testen"); writer.newLine();
		 * writer.write("Ik ben een testzin");
		 * 
		 * // int ch = 0; // while ((ch = writer.r)) // while ((ch = )) } catch
		 * (Exception e) { // TODO: handle exception }
		 */

		try (FileInputStream in = new FileInputStream("5. File IO\\Tekstje.txt");
				FileOutputStream out = new FileOutputStream("5. File IO\\Tekstje.zip")) {

			DeflaterInputStream dis = new DeflaterInputStream(in);
			int ch = 0;
			while ((ch = in.read()) != -1) {
				ch = in.read();
				out.write(ch);
			}
		} catch (

		FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
