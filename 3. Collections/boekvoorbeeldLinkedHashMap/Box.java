package boekvoorbeeldLinkedHashMap;

public class Box implements Comparable<Box> {

	private int width;
	private int lenght;
	private int height;

	public Box() {

	}

	public Box(int width, int lenght, int height) {
		super();
		this.width = width;
		this.lenght = lenght;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getVolume() {
		return width * lenght * height;
	}

	@Override
	public String toString() {
		return "Box [width=" + width + ", lenght=" + lenght + ", height=" + height + "]";
	}

	@Override
	public int compareTo(Box o) {
		return this.getVolume() - o.getVolume();
	}

}
