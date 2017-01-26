package opdracht5;

import java.util.Random;

public class JamesBondApp {

	public static void main(String[] args) throws InterruptedException {
		Random rand = new Random();
		TimeBomb bomb = new TimeBomb(10);
		bomb.activate();
		Thread.sleep(rand.nextInt(30000));
		bomb.disarm();

	}

}
