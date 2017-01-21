package boekVoorbeeldComparable;

import java.util.Comparator;

public class BoxLengthComparator implements Comparator<Box> {

	@Override
	public int compare(Box b1, Box b2) {
		return b1.getLenght() - b2.getLenght();
	}

}
