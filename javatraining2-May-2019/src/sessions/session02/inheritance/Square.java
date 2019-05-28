package sessions.session02.inheritance;

public class Square extends Shape {
	private int side;

	public Square(int side, String color) {
		super(color);
		this.side = side;
	}

	@Override
	public int getArea() {
		return side * side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + ", " + super.toString() + "]";
	}

}
