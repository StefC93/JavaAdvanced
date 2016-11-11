package oefening4Omkeren;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Omkeren<T> {

	public static void omkeren(List<?> lijst) {
		Collections.reverse(lijst);

	}

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		List<String> strList = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
		List<Double> dblList = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0));

		// intList normaal
		System.out.println("Lijst voor het omkeren: " + intList);
		omkeren(intList);
		System.out.println("Lijst na het omkeren: " + intList + "\n");

		// strList normaal
		System.out.println("Lijst voor het omkeren: " + strList);
		omkeren(strList);
		System.out.println("Lijst na het omkeren: " + strList + "\n");
		
		// dblList normaal
		System.out.println("Lijst voor het omkeren: " + dblList);
		omkeren(dblList);
		System.out.println("Lijst na het omkeren: " + dblList);

	}

}
