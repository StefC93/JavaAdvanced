package oefening1;

import java.util.Random;

public class Tover<T> {
	private static Duif d1 = new Duif();
	private static Konijn k1 = new Konijn();
	private static Random rand = new Random();

	public static <T> T toss(T duif, T konijn) {
		return rand.nextBoolean() ? duif : konijn;
	}

	private static Dier dier1 = Tover.<Dier>toss(d1, k1);

	public static void main(String[] args) {

		for (int i = 0; i < 2; i++) {
			if (i == 0) {
				System.out.println("De tovenaar kijkt een eerste keer in de hoed en... \n ...Er zit niets in de hoed!");
			} else {
				System.out.println("\nDe tovenaar kijkt een tweede keer in de hoed en... \n ...Er zit een " + dier1
						+ " in de hoed");
			}

		}

	}

}
