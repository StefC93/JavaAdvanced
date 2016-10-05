package oefening1;

import java.text.DecimalFormat;

//abstract = kan geen object van deze klasse aanmaken
public abstract class Werknemer implements Bedrijf {
	private String nr;
	private String naam;
	private Datum datumInD;

	public Werknemer() {

	}

	public Werknemer(String nr, String naam, Datum datumInD) {
		this.nr = nr;
		this.naam = naam;
		this.datumInD = new Datum(datumInD); // copy constructor
	}

	public void drukWerknemer() {
		System.out.println("Werknemer: " + getNr() + " " + getNaam());
		System.out.println("Datum in dienst: " + getDatumInD().drukDatum());
		System.out.print("Statuut: "); drukGegevens();
		System.out.printf("Loon: %s euro \n\n", new DecimalFormat("##.##").format(getMaandLoon()));
	}
	
	@Override
	public abstract double getMaandLoon();

	@Override
	public abstract void drukGegevens();

	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public Datum getDatumInD() {
		return datumInD;
	}

	public void setDatumInD(Datum datumInD) {
		this.datumInD = datumInD;
	}
}
