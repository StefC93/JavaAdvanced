package boekOpdracht1;
//outer class
public class Musician {
	//method
	public void play() {
		//object/instantie aanmaken van inner class en de inner method aanroepen
		Instrument i1 = new Instrument();
		i1.makeNoise();
	}
	//inner class
	public class Instrument {
		//method
		public void makeNoise() {
			System.out.println("tudu");
		}
	}
	
	public static void main(String[] args) {
		//outer class instantiëren en methode aanroepen
		Musician m1 = new Musician();
		m1.play(); //deze method maakt dan weer een instantie van de inner class met bijhorende method
		
		//inner class aanroepen via de outer class en bijhorende method
		Musician.Instrument i2 = m1.new Instrument();
		i2.makeNoise();
	}

}
