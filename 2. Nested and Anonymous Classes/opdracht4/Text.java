package opdracht4;

import klasOefening1.WordFilter;

public class Text {
	private String sentence;

	public Text(String sentence) {
		this.sentence = sentence;
	}

	public void printFilteredWords(WordFilter filter) {
		for (String w : sentence.split(" ")) {
			if (filter.isValid(w)) {
				System.out.println(w);
			}
		}
	}

	public String toString() {
		return sentence;
	}

	public void split(String string) {
		System.out.println(string);
	}
}