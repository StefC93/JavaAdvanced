package opdracht5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.InflaterOutputStream;

public class LeesGecomprimeerd {

	public static void main(String[] args) {
		try (FileInputStream in = new FileInputStream("5. File IO\\Tekstje.zip");
				FileOutputStream out = new FileOutputStream("5. File IO\\TekstjeUitgepakt.txt");) {

			InflaterOutputStream ios = new InflaterOutputStream(out);
			int ch = 0;
			while ((ch = in.read()) != -1) {
				ch = in.read();
				ios.write(ch);
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
