package oefening1;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Arbeider a1 = new Arbeider("A1", "Johan Collart", new Datum(01,9,2016), 13.37, 180);
		Arbeider a2 = new Arbeider("A2", "Peter Collart", new Datum(05,8,1988), 14.92, 120);
		
		Bediende b1 = new Bediende("B1", "Stef Collart", new Datum(03,07,2016), 2000);
		Bediende b2 = new Bediende("B2", "Veerle Jorissen", new Datum(02,11,1990), 2800);
		
		List<Werknemer> gegevens = new ArrayList<>();
		gegevens.add(a1);
		gegevens.add(a2);
		gegevens.add(b1);
		gegevens.add(b2);
		
		//List<Double> lonen = new ArrayList<>();
		
		
		for(Werknemer werknemer : gegevens){
			werknemer.drukWerknemer();
		}

	}

}
