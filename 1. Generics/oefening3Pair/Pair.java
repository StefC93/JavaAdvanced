package oefening3Pair;

public class Pair<T, U> {

	private T linker;
	public U rechter;

	public Pair(T linker, U rechter) {
		this.linker = linker;
		this.rechter = rechter;
	}

	// getters & setters
	public T getLinker() {
		return linker;
	}

	public void setLinker(T linker) {
		this.linker = linker;
	}

	public U getRechter() {
		return rechter;
	}

	public void setRechter(U rechter) {
		this.rechter = rechter;
	}

	public String toString() {
		return "Linkse paar: " + linker + "\n" + "Rechtse paar: " + rechter;
	}

}