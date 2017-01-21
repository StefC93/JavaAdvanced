package opdracht7;

public class AgeComparator implements Comparable<Persoon>{
	
	public int compareTo(Persoon p1, Persoon p2) {
		return p1.getAge() - p2.getAge();
	}

	@Override
	public int compareTo(Persoon o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
