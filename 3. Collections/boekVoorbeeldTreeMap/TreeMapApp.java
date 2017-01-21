package boekVoorbeeldTreeMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapApp {

	public static void main(String[] args) {
		
		SortedMap<String, Box> boxes = new TreeMap<>();
		boxes.put("Voor John", new Box(4,2,2));
		boxes.put("Voor Stef", new Box(1, 2, 3));
		boxes.put("Voor Jefke", new Box(5,7,4));
		
		System.out.println(boxes.get(boxes.firstKey()));
		System.out.println(boxes.get(boxes.lastKey()));
	}

}
