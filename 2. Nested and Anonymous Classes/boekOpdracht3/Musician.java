package boekOpdracht3;
//bolt niet goed


//outer class
public class Musician implements Instrument {
	// method
	public void play() {
		Instrument i1 = new Instrument() {
			
			@Override
			public void makeNoise() {
				System.out.println("tudu");				
			}
		};
	}

	// inner class
	public Instrument instrumentje() {
		return new Instrument() {

			@Override
			public void makeNoise() {
				System.out.println("tudu");
			}
		};

	}

	public static void main(String[] args) {
		// outer class instantiëren en methode aanroepen
		Musician m1 = new Musician();
		m1.makeNoise();
		
	}

	@Override
	public void makeNoise() {
		System.out.println("tidi");		
	}

}