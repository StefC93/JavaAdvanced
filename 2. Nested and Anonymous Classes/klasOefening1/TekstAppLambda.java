package klasOefening1;

public class TekstAppLambda {

	public static void main(String[] args) {
		Tekst tekst = new Tekst("Hello this is an example sentence");

		System.out.println("Words containing 'e'");
		tekst.printFilteredWords(words -> words.contains("e"));

	}

}
