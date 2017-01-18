package opdracht2;

import java.util.HashSet;
import java.util.Set;

public class PersoonApp {

	public static void main(String[] args) {

		Set<Persoon> personen = new HashSet<>();

		Persoon p1 = new Persoon("Collart", "Stef", "Man", 23, 72, 1.80);
		Persoon p2 = new Persoon("Jorissen", "Veerle", "Vrouw", 59, 70, 1.70);

		Persoon p1punt1 = new Persoon("Collart", "Stef", "Man", 23, 72, 1.80);

		personen.add(p1);
		personen.add(p2);
		personen.add(p1punt1);


		/*
		 * for (Persoon el:personen){ System.out.println(el); }
		 */
		personen.forEach(s -> System.out.println(s));
	}

}
