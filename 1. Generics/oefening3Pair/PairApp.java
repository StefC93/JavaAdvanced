package oefening3Pair;

public class PairApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<?,?> p1 = new Pair<>(123, "test");
		System.out.println(p1);
		
		System.out.println();
		
		Pair<?,?> p2 = new Pair<>(12345, p1);
		System.out.println(p2);
	}

}
