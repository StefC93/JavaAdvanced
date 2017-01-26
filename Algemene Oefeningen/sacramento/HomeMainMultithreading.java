package sacramento;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import sacramentoOpgelost.Home;

public class HomeMainMultithreading {

	public static void main(String[] args) {
		
		HomeFileReader FileReader = new HomeFileReader();
		List<HomeInfo> homeInfoList = FileReader.readFile(Paths.get("Algemene Oefeningen\\sacramento\\Sacramentorealestatetransactions.csv").toFile());
		
		System.out.println("Huizen boven 250k:");
		homeInfoList.stream().filter(s->s.getPrice()>250000).forEach(System.out::println);
		
		System.out.println("\n\nHuizen met meer dan 4 slaapkamers");
		homeInfoList.stream().filter(s->s.getBeds()>4).forEach(System.out::println);
		
		System.out.println("buh");
//		Map<String, Long> aantalVerkopenPerZip = homeInfoList.stream()
//				.collect(Collectors.groupingBy(Home::getZip, Collectors.counting()));
		
		System.out.println("alles: ");
		//homeInfoList.forEach(System.out::println);

	}

}
