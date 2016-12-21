package klasOefening2;

import java.io.File;
import java.nio.channels.FileLock;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReaderMain {

	public static void main(String[] args) {

		// not synchronized
		List<String> listLines = new LinkedList<>();

		// synchronized
		List<String> listLinesSynchronized = Collections.synchronizedList(listLines);

	/*	File[] fileList = listCSVFiles();
		Thread[] threads = new Thread[fileList.length];
		int index = 0;
		for (File f : fileList) {
			Thread fileThread = new Thread(new FileReaderThread(f, listLinesSynchronized));
			fileThread.start();
			threads[index++] = fileThread;
		}*/

		System.out.println("Looking for files in: 8. Multithreading/TestData CSV Java/");
		Path file1 = Paths.get("8. Multithreading/TestData CSV Java/testdata1.csv");
		Path file2 = Paths.get("8. Multithreading/TestData CSV Java/testdata2.csv");
		Path file3 = Paths.get("8. Multithreading/TestData CSV Java/testdata3.csv");
		Path file4 = Paths.get("8. Multithreading/TestData CSV Java/testdata4.csv");
		Path file5 = Paths.get("8. Multithreading/TestData CSV Java/testdata5.csv");

		Thread FileReaderThread1 = new Thread(new FileReaderThread(file1, listLinesSynchronized));
		FileReaderThread1.setName("1");
		Thread FileReaderThread2 = new Thread(new FileReaderThread(file2, listLinesSynchronized));
		FileReaderThread2.setName("2");
		Thread FileReaderThread3 = new Thread(new FileReaderThread(file3, listLinesSynchronized));
		FileReaderThread3.setName("3");
		Thread FileReaderThread4 = new Thread(new FileReaderThread(file4, listLinesSynchronized));
		FileReaderThread4.setName("4");
		Thread FileReaderThread5 = new Thread(new FileReaderThread(file5, listLinesSynchronized));
		FileReaderThread5.setName("5");

		FileReaderThread1.start();
		FileReaderThread2.start();
		FileReaderThread3.start();
		FileReaderThread4.start();

		// Thread 1-4 zijn klaar binnen de sleep van 5s. Hierdoor
		// komen de lijnen van thread 5 dus als laatste in de output.
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		FileReaderThread5.start();

		try {
			FileReaderThread1.join();
			FileReaderThread2.join();
			FileReaderThread3.join();
			FileReaderThread4.join();
			FileReaderThread5.join();
		} catch (InterruptedException e) {
			System.out.println("Threads could not be joined");
			e.printStackTrace();
		}

		System.out.println("#elements" + listLinesSynchronized);
		System.out.println(listLinesSynchronized.size() == 500 ? "Yeah baby!" : "meh...");
	}

	private static File[] listCSVFiles() {
		Path root = Paths.get("");

		File rootFile = root.getFileName().toFile();
		System.out.println(rootFile.getAbsolutePath());
		File[] fileList = rootFile.listFiles();

		for (int i = 0; i < fileList.length; i++) {
			if (fileList[i].getName().endsWith(".csv")) {
				System.out.println(fileList[i].getName());
			}
		}
		return fileList;

	}

}
