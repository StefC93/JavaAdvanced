package klasOefening1;

public class TekstApp {

	public static void main(String[] args) {
		Tekst tekst = new Tekst("Hello this is an example sentence");

		System.out.println("Words containing 'e'");
		tekst.printFilteredWords(new WordFilter() {
			@Override
			public boolean isValid(String word) {
				return word.contains("e");
			}
		});

	}

}
