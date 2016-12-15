package boekOpdracht4;

import klasOefening1.WordFilter;

public class TextApp {

	public static void main(String[] args) {
		final String a = "e";

		Text text = new Text("Hello this is an example of a sentence containing words");

		System.out.println("*** Words containing 'e' ***");
		text.printFilteredWords((s) -> s.contains(a)); //punt 1
		System.out.println("Words containing 'e' as second character");
		text.printFilteredWords((s) -> s.contains(s)); //punt 2 TBA
	}
}