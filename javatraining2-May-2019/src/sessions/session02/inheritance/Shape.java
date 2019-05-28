package sessions.session02.inheritance;

// o clasa final nu poate fi mostenita
public abstract class Shape {
	private String color;

//	public Shape() {
//		this.color = "white";
//	}

	public Shape(String color) {
		this.color = color;
	}

	public String getColor() {
		return color.toUpperCase();
	}

	public abstract int getArea();

	// o metoda final nu poate fi overrideuita
	@Override
	public String toString() {
		return "" + getColor();
	}
}
