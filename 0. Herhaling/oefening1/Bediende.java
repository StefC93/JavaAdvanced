package oefening1;

public class Bediende extends Werknemer {

	private double loon;

	public Bediende(String nr, String naam, Datum datumInD, double loon) {
		super(nr, naam, datumInD);
		this.loon = loon;
	}

	@Override
	public double getMaandLoon() {
		return loon;
	}

	@Override
	public void drukGegevens() {
		System.out.println("bediende");
	}

	public double getLoon() {
		return loon;
	}

	public void setLoon(double loon) {
		this.loon = loon;
	}
	
	

}
