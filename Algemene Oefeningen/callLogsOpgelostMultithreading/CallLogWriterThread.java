package callLogsOpgelostMultithreading;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.Collection;

public class CallLogWriterThread extends Thread {

	Collection<CallLog> callLogList;
	String folder;
	String filename;

	public CallLogWriterThread(Collection<CallLog> callLogList, String folder, String filename) {
		super();
		this.callLogList = callLogList;
		this.folder = folder;
		this.filename = filename;
	}

	@Override
	public void run() {
		String fullFilename = folder + System.getProperty("file.separator") + filename;
		System.out.printf("[%s] Writing report %s ...\n", Thread.currentThread().getName(), fullFilename);
		try {
			if (callLogList == null || callLogList.isEmpty()) {
				return;
			}

			Files.createDirectories(Paths.get(folder), new FileAttribute[0]);

			FileWriter writer = new FileWriter(fullFilename);
			for (CallLog callLog : callLogList) {
				writer.write(CallLogFactory.createCallLogLine(callLog));
			}
			writer.flush();
			writer.close();

		} catch (IOException e) {
			System.err.println("Exception in writing report : " + fullFilename);
		}

	}

}
