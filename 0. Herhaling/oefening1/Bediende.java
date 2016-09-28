package oefening1;

public class Bediende extends Werknemer {
	
	private double loon;
	
	public Bediende (String nr, String naam, Datum datumInD, double loon) {
		super(nr, naam, datumInD);
		this.loon = loon;
	}

}
