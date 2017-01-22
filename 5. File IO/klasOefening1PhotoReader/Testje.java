package klasOefening1PhotoReader;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Testje {
	
	public static void main(String[] args) {
		Path p1 = Paths.get("Capture.png");
		System.out.println(p1.toAbsolutePath());
		
		Path p2 = Paths.get("C:\\Users\\Stef\\git\\JavaAdvanced\\Capture.png");
		System.out.println(p2.getParent());
	}

}
