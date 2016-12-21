package klasOefening2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class FileReaderThread implements Runnable {

	private List<String> listLines;
	private BufferedReader fileReader;

	public FileReaderThread(Path file1, List<String> listLinesSynchronized) {
		this.listLines = listLines;
		init(file1.toFile());
	}

	public FileReaderThread(File f, List<String> listLinesSynchronized) {
		this.listLines = listLines;
		//init(file2.toFile());
	}

	private void init(File file) {
		try {
			fileReader = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			System.out.println("Filereader problem..." + e.getMessage());
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {
			System.out.println(listLines.size());
			String line = "";
			while ((line = fileReader.readLine()) != null) {
				listLines.add(line);
				System.out.println(Thread.currentThread().getName());
				Thread.yield();
			}
		} catch (IOException e) {
			System.out.println("Reading lines failed...");
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
