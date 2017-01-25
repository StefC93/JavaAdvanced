package klasOefening1;

public class Tekst {
	private String sentence;

	public Tekst(String sentence) {
		this.sentence = sentence;
	}

	public void printFilteredWords(WordFilter filter) {
		for (String word : sentence.split(" ")) {
			if (filter.isValid(word)) {
				System.out.println(word);
			}
		}
	}

	public String toString() {
		return sentence;
	}

}
