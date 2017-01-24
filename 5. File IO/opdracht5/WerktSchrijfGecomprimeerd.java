package opdracht5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

public class WerktSchrijfGecomprimeerd {

	public static void main(String[] args) {

		Deflater d = new Deflater();

		try (FileOutputStream out = new FileOutputStream("5. File IO\\TekstjeComprimeren.txt");
				DeflaterOutputStream dout = new DeflaterOutputStream(out, d);) {

			dout.write("Enkele zinnen om te testen".getBytes());
			dout.write("\n".getBytes());
			dout.write("Ik ben een testzin".getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
