package boekVoorbeeld2;

public class CharacterPrinter implements Runnable {

	private char c;
	private int count;

	public CharacterPrinter(char c, int count) {
		this.c = c;
		this.count = count;
	}

	@Override
	public void run() {
		for (int i = 0; i < count; i++) {
			System.out.println("#" + i + ": " + c);
			// Als er 2 of meerdere threads met dezelfde prioriteit zijn wordt
			// met de methode yield() afgedwongen dat de threads afwisselend aan
			// de beurt komen.
			Thread.yield();
		}

	}

}
