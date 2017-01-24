package boekVoorbeeld8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteProperties {

	public static void main(String[] args) {

		// FileOuptStream object maken waar de properties worden weggeschreven
		try (FileOutputStream file = new FileOutputStream("5. File IO\\boekVoorbeeld8\\Application.properties")) {

			// Properties object aanmaken
			Properties prop = new Properties();

			// Verschillende waardes in het Properties object steken
			prop.setProperty("Attribute1", "Value1");
			prop.setProperty("Attribute2", "Value2");
			prop.setProperty("Attribute3", "Value3");

			// De properties in het .properties bestand steken
			prop.store(file, "Application properties");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// FileOuptStream object maken waar de properties worden weggeschreven
		try (FileOutputStream file = new FileOutputStream("5. File IO\\boekVoorbeeld8\\Application.xml")) {

			// Properties object aanmaken
			Properties prop = new Properties();

			// Verschillende waardes in het Properties object steken
			prop.setProperty("Attribute1", "Value1");
			prop.setProperty("Attribute2", "Value2");
			prop.setProperty("Attribute3", "Value3");

			// De properties in XML-formaat in het bestand steken
			prop.storeToXML(file, "Application properties");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
