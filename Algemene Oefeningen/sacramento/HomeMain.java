package sacramento;

import java.nio.file.Paths;
import java.util.List;

public class HomeMain {

	public static void main(String[] args) {
		
		HomeFileReader FileReader = new HomeFileReader();
		List<HomeInfo> homeInfoList = FileReader.readFile(Paths.get("Algemene Oefeningen\\sacramento\\Sacramentorealestatetransactions.csv").toFile());
		homeInfoList.forEach(System.out::println);

	}

}
