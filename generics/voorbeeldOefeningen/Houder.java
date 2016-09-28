package voorbeeldOefeningen;

import java.util.ArrayList;
import java.util.List;

public class Houder<T> {
	private T inhoud;

	public T geef() {
		return inhoud;
	}

	public Houder(T inhoud) {
		this.inhoud = inhoud;
	}

	public static void main(String[] args) {
		List<Houder> myList = new ArrayList<>();
		myList.add(new Houder<Integer>(2));
		myList.add(new Houder<String>("Test"));
		myList.add(new Houder<Student>(new Student("Jan")));

		for (Houder item : myList) {
			System.out.println(item.geef());
		}


		// Houder<Integer> houder1 = new Houder<>(1);
		// Houder<String> houder2 = new Houder<>("Test");
		// Houder<Student> houder3 = new Houder<>(new Student("Jan"));
		//
		// Integer inhoud1 = houder1.geef();
		// String inhoud2 = houder2.geef();
		// Student inhoud3 = houder3.geef();
		//
		// System.out.println("Inhoud 1 = " + inhoud1 + "\n"
		// + "Inhoud 2 = " + inhoud2 + "\n"
		// + "Inhoud 3 = " + inhoud3);
	}
}
