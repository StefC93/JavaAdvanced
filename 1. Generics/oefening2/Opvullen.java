package oefening2;

import java.util.ArrayList;
import java.util.List;

public class Opvullen<T> {
	private T vulling;

	public T opvullen() {
		return vulling;
	}

	public Opvullen(T vulling) {
		this.vulling = vulling;
	}

	public static <T> void main(String[] args) {
		List<Opvullen> myList = new ArrayList<>();

		for (int i = 0; i < 20; i++) {
			myList.add(new Opvullen<String>("nummer: " + (i + 1)));
		}

		for (Opvullen item : myList) {
			System.out.println(item.vulling);
		}
	}

}
