package boekVoorbeeld1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyboardApp {

	public static void main(String[] args) {

		// Inputstreamreader om input te lezen
		// Om een hele lijn te kunnen lezen steken we dit in een BufferedReader
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader keyboard = new BufferedReader(in);
		
		System.out.println("Enter your name: ");

		try {
			String name = keyboard.readLine(); // Lees input
			System.out.println("Hello " + name);
		} catch (Exception e) {
			System.out.println("Oops, er is iets mis gegaan!");
			e.getMessage();
		}
	}

}
