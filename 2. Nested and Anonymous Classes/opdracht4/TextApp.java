package opdracht4;

public class TextApp {

	public static void main(String[] args) {
		final String a = "e";
		Text text = new Text("Hello this is an example of a sentence containing words");

		System.out.println("*** Words containing 'e' ***");
		text.printFilteredWords((s) -> s.contains(a)); // punt 1

		System.out.println("\nWords containing 'e' as second character");
		text.printFilteredWords((s) -> s.startsWith("e", 1));
	}
}