package klasExtraOefening1;

public class Naam {

	private String voornaam;

	public Naam() {

	}

	public Naam(String voornaam) {
		this.voornaam = voornaam;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
	
	public String getUpperVoornaam(){
		return voornaam.toUpperCase();
	}
}
