package sacramento;

import java.util.*;
import java.io.*;
import java.nio.file.Files;

public class HomeFileReader {

	public HomeFileReader() {

	}

	public List<HomeInfo> readFile(File toRead) {
		List<HomeInfo> homeInfoList = new ArrayList<>();
		// BufferedReader bufferedReader = null;

		try (BufferedReader bufferedReader = Files.newBufferedReader(toRead.toPath())) {
			String line = bufferedReader.readLine(); // De eerste lijn overslaan
														// (header kolom)
			while ((line = bufferedReader.readLine()) != null) {
				String[] splittedLine = line.split(",");
				HomeInfo homeInfo = new HomeInfo(splittedLine[0], splittedLine[1], splittedLine[2], splittedLine[3],
						Integer.parseInt(splittedLine[4]), Integer.parseInt(splittedLine[5]),
						Integer.parseInt(splittedLine[6]), splittedLine[7], new Date(splittedLine[8]),
						Double.parseDouble(splittedLine[9]), Double.parseDouble(splittedLine[10]),
						Double.parseDouble(splittedLine[11]));
				homeInfoList.add(homeInfo);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File kan niet gelezen worden. " + e.getMessage());
			e.printStackTrace();
		}
		return homeInfoList;

	}
}
