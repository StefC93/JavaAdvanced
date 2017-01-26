package opdracht3;

public class CharacterPrinterYield implements Runnable {

	private char c;
	private int count;

	public CharacterPrinterYield(char c, int count) {
		this.c = c;
		this.count = count;
	}

	@Override
	public void run() {
		for (int i = 0; i < count; i++) {
			System.out.println("#" + i + ": " + c);
		}

	}

}
