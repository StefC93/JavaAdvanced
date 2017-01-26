package opdracht5;

public class TimeBomb implements Runnable {

	private int seconden;
	private boolean disarm;

	public TimeBomb(int seconden) {
		this.seconden = seconden;
	}

	@Override
	public void run() {
		for (int i = seconden; i >= 0; i--) {
			try {
				Thread.sleep(1000);
				System.out.println("De bom ontploft over " + i + " seconden!");
				if (disarm) {
					System.out.println("The bomb has been disarmed! Good job!");
					break;
				}
				if (i == 0) {
					System.out.println("Oops, you're dead! :(");
				}
			} catch (InterruptedException e) {
				e.getMessage();
				e.printStackTrace();
			}
		}
	}

	public void activate() {
		new Thread(this).start();

	}

	public void disarm() {
		disarm = true;
	}

}
