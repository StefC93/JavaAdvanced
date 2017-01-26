package opdracht4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class Clock implements Runnable {

	// bolt niet
	private Date tijd;
	Timer timer = new Timer("Display Timer");

	DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	public Clock() {

	}

	public Clock(DateFormat dateformat) {
		super();
		this.dateFormat = dateformat;
	}

	@Override
	public void run() {

	}

}
