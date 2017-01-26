package sacramentoOpgelost;

import java.util.Date;

public class Home {

    private String street;
    private String city;
    private String zip;
    private String state;
    private int beds;
    private int baths;
    private int sq_ft;
    private HomeType type;
    private Date sale_data;
    private double price;
    private double lattitude;
    private double longtitude;

    @Override
    public String toString() {
        return "Home{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zip='" + zip + '\'' +
                ", state='" + state + '\'' +
                ", beds=" + beds +
                ", baths=" + baths +
                ", sq_ft=" + sq_ft +
                ", type=" + type.toString() +
                ", sale_data=" + sale_data.toString() +
                ", price=" + price +
                ", lattitude=" + lattitude +
                ", longtitude=" + longtitude +
                '}';
    }

    public Home(String street, String city, String zip, String state, int beds, int baths, int sq_ft, HomeType type, Date sale_data, double price, double lattitude, double longtitude) {
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.state = state;
        this.beds = beds;
        this.baths = baths;
        this.sq_ft = sq_ft;
        this.type = type;
        this.sale_data = sale_data;
        this.price = price;
        this.lattitude = lattitude;
        this.longtitude = longtitude;
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

    public int getSq_ft() {
        return sq_ft;
    }

    public void setSq_ft(int sq_ft) {
        this.sq_ft = sq_ft;
    }

    public HomeType getType() {
        return type;
    }

    public void setType(HomeType type) {

        if (type == null) {
            System.out.println("Type == null");
        }

        this.type = type;
    }

    public Date getSale_data() {
        return sale_data;
    }

    public void setSale_data(Date sale_data) {
        this.sale_data = sale_data;
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

    public double getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(double longtitude) {
        this.longtitude = longtitude;
    }


}