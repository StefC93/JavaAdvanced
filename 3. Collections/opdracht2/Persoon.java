package opdracht2;

public class Persoon {

	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	private double weight;
	private double height;

	public Persoon() {

	}

	public Persoon(String firstName, String lastName, String gender, int age, double weight, double height) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Voornaam: " + firstName + ", Achternaam: " + lastName + ", Geslacht: " + gender + ", Leeftijd: " + age
				+ ", Gewicht: " + weight + ", Lengte: " + height;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
