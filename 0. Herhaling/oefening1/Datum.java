package oefening1;

//final = kan niet overerven van deze klasse
public final class Datum {

	private int dag;
	private int maand;
	private int jaar;

	public Datum() {

	}

	public Datum(int dag, int maand, int jaar) {
		this.dag = dag;
		this.maand = maand;
		this.jaar = jaar;
	}

	// copy constructor
	public Datum(Datum datumInD) {
		this(datumInD.getDag(), datumInD.getMaand(), datumInD.getJaar());
	}

	public String drukDatum() {
		return getDag() + "/" + getMaand() + "/" + getJaar();
	}

	public int getDag() {
		return dag;
	}

	public void setDag(int dag) {
		this.dag = dag;
	}

	public int getMaand() {
		return maand;
	}

	public void setMaand(int maand) {
		this.maand = maand;
	}

	public int getJaar() {
		return jaar;
	}

	public void setJaar(int jaar) {
		this.jaar = jaar;
	}

}
