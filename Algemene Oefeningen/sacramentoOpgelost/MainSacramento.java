package sacramentoOpgelost;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class MainSacramento {

	// Aparte lijst maken voor elke collectie
	private static List<Home> data = new LinkedList<Home>();
	private static List<Home> huizenBoven200K = new LinkedList<Home>();
	private static List<Home> huizenMeerAls4Slaapkamers = new LinkedList<Home>();

	public static void main(String[] args) {
		// Thread maken en starten die alle data inleest
		try {
			Thread reader = new Thread(() -> readData());
			reader.start();
			reader.join();
			// Alle date uitprinten
			data.forEach(System.out::println);

			// Stream om enkel de huizen boven 200k te krijgen
			huizenBoven200K = data.stream().filter(h -> h.getPrice() > 200000).collect(Collectors.toList());

			// Stream om enkel huizen met > 4 slaapkamers te krijgen
			huizenMeerAls4Slaapkamers = data.stream().filter(h -> h.getBeds() > 4).collect(Collectors.toList());

			// De huizen per zipcode verzamelen en tellen hoeveel/zip
			Map<String, Long> aantalVerkPerZip = data.stream()
					.collect(Collectors.groupingBy(Home::getZip, Collectors.counting()));
			
			// Alle waardes van de map doorlopen en printen
			for (Map.Entry<String, Long> home : aantalVerkPerZip.entrySet()) {
				System.out.println(home.getKey() + " = " + home.getValue());
			}

			// Aparte thread maken om de huizen > 200k weg te schrijven
			Thread writer200K = new Thread(() -> {
				try {
					WriteListThread(huizenBoven200K, Paths.get("Algemene Oefeningen\\sacramentoOpgelost\\200KHuizen.txt"));
				} catch (IOException e) {
					e.printStackTrace();
				}
			});

			// Aparte thread maken om de huizen met > 4 slaapkamers weg te schrijven
			Thread writer4Bed = new Thread(() -> {
				try {
					WriteListThread(huizenMeerAls4Slaapkamers,
							Paths.get("Algemene Oefeningen\\sacramentoOpgelost\\4BedHuizen.txt"));
				} catch (IOException e) {
					e.printStackTrace();
				}
			});

			// De aparte threads starten
			writer200K.start();
			writer4Bed.start();

		} catch (InterruptedException ex) {
			System.out.println("ex = " + ex);
		}
	}

	// Nieuwe BufferedWriter maken die het path meekrijgt
	private static void WriteListThread(List<? extends Home> lijst, Path p) throws IOException {
		BufferedWriter writer = Files.newBufferedWriter(p);
		try {
			// Alle lijnen van de stream doorlopen en wegschrijven 
			lijst.forEach(h -> {
				try {
					writer.write(h.toString());
					writer.newLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
		} catch (Exception ex) {
			System.out.println("ex = " + ex);
		} finally {
			writer.close();
		}
	}

	// Methode om de datum juist te krijgen
	private static Date parseDate(String date, String format) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat(format, Locale.ENGLISH);
		return formatter.parse(date);
	}

	// Methode om alle data in te lezen en te verwerken (splitsen)
	private static void readData() {
		try {
			Path path = Paths.get("Algemene Oefeningen\\sacramentoOpgelost\\Sacramentorealestatetransactions.csv");
			BufferedReader reader = Files.newBufferedReader(path);
			String line = null;
			boolean skipFirst = true;
			String[] arr;
			while ((line = reader.readLine()) != null) {
				if (!skipFirst) {
					arr = line.split(",");
					data.add(new Home(arr[0], arr[1], arr[2], arr[3], Integer.parseInt(arr[4]),
							Integer.parseInt(arr[5]), Integer.parseInt(arr[6]), HomeType.fromString(arr[7]),
							parseDate(arr[8], "EEE MMM dd HH:mm:ss z yyyy"), Double.parseDouble(arr[9]),
							Double.parseDouble(arr[10]), Double.parseDouble(arr[11])));
				} else {
					skipFirst = false;
				}
			}
		} catch (IOException ex) {
			System.out.println("ex = " + ex);
		} catch (ParseException ecx) {
			System.out.println("ecx = " + ecx);
		}
	}

}
