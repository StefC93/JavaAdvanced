package opdracht5;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class WerktLeesGecomprimeerd {

	public static void main(String[] args) {

		try (FileInputStream in = new FileInputStream("5. File IO\\TekstjeComprimeren.txt");
				InflaterInputStream ini = new InflaterInputStream(in);
				ByteArrayOutputStream bout = new ByteArrayOutputStream(512)) {

			int b;
			while ((b = ini.read()) != -1) {
				bout.write(b);
			}

			String s = new String(bout.toByteArray());
			System.out.print(s);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
