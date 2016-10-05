package oefening1;

public class Arbeider extends Werknemer{
	private double uurloon;
	private int aantalUren;
	
	public Arbeider(String nr, String naam, Datum datuminD, double uurloon, int aantalUren){
		super(nr, naam, datuminD);
		this.uurloon = uurloon;
		this.aantalUren = aantalUren;
	}

	@Override
	public double getMaandLoon() {
		int overUren = 0;
		double loon = 0;
		if (aantalUren > 160) {
			overUren = aantalUren - 160;
			loon = (160 * uurloon) + (overUren * 1.5);
		} else {
			loon = aantalUren * uurloon;
		}
		return loon;
	}

	@Override
	public void drukGegevens() {
		System.out.println("arbeider");
		
	}

	public double getUurloon() {
		return uurloon;
	}

	public void setUurloon(double uurloon) {
		this.uurloon = uurloon;
	}

	public int getAantalUren() {
		return aantalUren;
	}

	public void setAantalUren(int aantalUren) {
		this.aantalUren = aantalUren;
	}
	
	
}
