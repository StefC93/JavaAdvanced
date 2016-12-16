package opdracht5;

public class Text {
	private String sentence;
	
	public Text (String sentence) {
		this.sentence = sentence;
	}
	public void printProcessedWords(WordProcessor processor) {
		for (String w : sentence.split(" ")) {
			System.out.println(processor.process(w));
		}
	}
}
