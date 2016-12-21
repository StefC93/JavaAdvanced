package klasOefening2;

import java.util.Date;

import callLogs.Status;

public class CallLog {

	private int id;
	private String naam;
	private Date datum;
	private Date tijd;
	private String bedrijf;
	private String omschrijving;
	private int prio;
	private Status status;

	public CallLog(int id, String naam, Date datum, Date tijd, String bedrijf, String omschrijving, int prio,
			Status status) {
		this.id = id;
		this.naam = naam;
		this.datum = datum;
		this.tijd = tijd;
		this.bedrijf = bedrijf;
		this.omschrijving = omschrijving;
		this.prio = prio;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public Date getTijd() {
		return tijd;
	}

	public void setTijd(Date tijd) {
		this.tijd = tijd;
	}

	public String getBedrijf() {
		return bedrijf;
	}

	public void setBedrijf(String bedrijf) {
		this.bedrijf = bedrijf;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public int getPrio() {
		return prio;
	}

	public void setPrio(int prio) {
		this.prio = prio;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
