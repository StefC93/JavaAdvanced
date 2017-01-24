package opdracht9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ApplicationProperties {
	private String filename;

	private int x;
	private int y;
	private int width = 555;
	private int height;

	public ApplicationProperties(String filename) {
		super();
		this.filename = filename;
	}

	Properties prop = new Properties();

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getPropertyValue(String key) {
		return this.prop.getProperty(key, "Its Default Value");
	}

	public void load() {
		try (FileInputStream file = new FileInputStream("5. File IO\\opdracht9\\Application.properties")) {

			prop.load(file);
			prop.list(System.out);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void store() {
		try (FileOutputStream file = new FileOutputStream("5. File IO\\opdracht9\\Application.properties")) {

			prop.put("x-positie", Integer.toString(getX()));
			prop.put("y-positie", Integer.toString(getY()));
			prop.put("Hoogte", Integer.toString(getHeight()));
			prop.put("Breedte", Integer.toString(getWidth()));

			prop.store(file, "Application properties");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
