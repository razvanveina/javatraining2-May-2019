package sessions.session02.inheritance;

public class Circle extends Shape {
	private int radius;

	public Circle(int radius, String color) {
		super(color);
		this.radius = radius;
	}

	@Override
	public int getArea() {
		return (int) (Math.PI * radius * radius);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", " + super.toString() + "]";
	}

}
