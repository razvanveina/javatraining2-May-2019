package sessions.session02.inheritance;

public class Rectangle extends Shape {
	private int length;
	private int width;

	public Rectangle(int length, int width, String color) {
		super(color);
		this.length = length;
		this.width = width;
	}

	@Override
	public int getArea() {
		return length * width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", " + super.toString() + "]";
	}

}
