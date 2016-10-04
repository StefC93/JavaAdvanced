package voorbeeldOefeningen;

public class Student {
	private static String naam;
	
	public Student(String naam) {
		this.naam = naam;
	}
	public String toString(){
		return "Ik ben " + Student.getNaam();
	}
	public static String getNaam() {
		return naam;
	}
}
