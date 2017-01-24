package opdracht9;

public class ApplicationPropertiesApp {

	public static void main(String[] args) {
		
		ApplicationProperties appProp = new ApplicationProperties("5. File IO\\opdracht9\\test.properties");
		
		appProp.setX(500);
		appProp.setY(300);
		appProp.setHeight(800);
		appProp.setWidth(600);
		
		appProp.store();
		appProp.load();
	}

}
