package call.logs;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;

public class CallLogApp {

	public static void main(String[] args) {
		Set<StringBuffer> set = new TreeSet();

		ArrayList<String> logs = new ArrayList<String>();
		String[] lines = CallLogData.getCallLogData().split("\n");

		for (String log : lines) {
			// System.out.println(log);
			logs.add(log);
		}
		
		String[] vars = CallLogData.getCallLogData().split(";");
		


	}

}
