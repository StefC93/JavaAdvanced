package sacramento;

import java.util.Date;

public class HomeInfo {

	private String street;
	private String city;
	private String zip;
	private String state;
	private int beds;
	private int baths;
	private int squareFeet;
	private String type;
	private Date saleDate;
	private double price;
	private double lattitude;
	private double longitude;
	
	public HomeInfo() {
		
	}

	public HomeInfo(String street, String city, String zip, String state, int beds, int baths, int squareFeet,
			String type, Date saleDate, double price, double lattitude, double longitude) {
		super();
		this.street = street;
		this.city = city;
		this.zip = zip;
		this.state = state;
		this.beds = beds;
		this.baths = baths;
		this.squareFeet = squareFeet;
		this.type = type;
		this.saleDate = saleDate;
		this.price = price;
		this.lattitude = lattitude;
		this.longitude = longitude;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getBeds() {
		return beds;
	}

	public void setBeds(int beds) {
		this.beds = beds;
	}

	public int getBaths() {
		return baths;
	}

	public void setBaths(int baths) {
		this.baths = baths;
	}

	public int getSquareFeet() {
		return squareFeet;
	}

	public void setSquareFeet(int squareFeet) {
		this.squareFeet = squareFeet;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getLattitude() {
		return lattitude;
	}

	public void setLattitude(double lattitude) {
		this.lattitude = lattitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + baths;
		result = prime * result + beds;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		long temp;
		temp = Double.doubleToLongBits(lattitude);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(longitude);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((saleDate == null) ? 0 : saleDate.hashCode());
		result = prime * result + squareFeet;
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((zip == null) ? 0 : zip.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HomeInfo other = (HomeInfo) obj;
		if (baths != other.baths)
			return false;
		if (beds != other.beds)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (Double.doubleToLongBits(lattitude) != Double.doubleToLongBits(other.lattitude))
			return false;
		if (Double.doubleToLongBits(longitude) != Double.doubleToLongBits(other.longitude))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (saleDate == null) {
			if (other.saleDate != null)
				return false;
		} else if (!saleDate.equals(other.saleDate))
			return false;
		if (squareFeet != other.squareFeet)
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (zip == null) {
			if (other.zip != null)
				return false;
		} else if (!zip.equals(other.zip))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HomeInfo [street=" + street + ", city=" + city + ", zip=" + zip + ", state=" + state + ", beds=" + beds
				+ ", baths=" + baths + ", squareFeet=" + squareFeet + ", type=" + type + ", saleDate=" + saleDate
				+ ", price=" + price + ", lattitude=" + lattitude + ", longitude=" + longitude + "]";
	}

}
