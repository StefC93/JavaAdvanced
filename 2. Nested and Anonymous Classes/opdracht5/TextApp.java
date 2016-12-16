package opdracht5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TextApp {

	public static void main(String[] args) {
		Text text = new Text("145 236 9852 3658");
		List<String> strList = new ArrayList<>(Arrays.asList());
		System.out.println("Splitsen op spatie");
		text.printProcessedWords(TextUtil::quote);
		
		System.out.println("Omkeren");
		text.printProcessedWords(TextUtil::reverse);
		
	}

}
