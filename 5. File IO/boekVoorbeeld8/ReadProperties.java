package boekVoorbeeld8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) {
		
		System.out.println("Inhoud van het .properties bestand: ");
		try (FileInputStream file = new FileInputStream("5. File IO\\boekVoorbeeld8\\Application.properties")) {
			
			Properties props = new Properties();
			props.load(file);
			props.list(System.out);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\nInhoud van het .xml bestand: ");
		try (FileInputStream file = new FileInputStream("5. File IO\\boekVoorbeeld8\\Application.xml")) {
			
			Properties props = new Properties();
			props.load(file);
			props.list(System.out);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
