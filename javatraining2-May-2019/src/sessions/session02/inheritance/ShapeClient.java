package sessions.session02.inheritance;

public class ShapeClient {
	public static void main(String[] args) {
		int sum = 0;
		/*
		 * Square[] squares = { // new Square(10, "red"), // new Square(11, "blue") };
		 * 
		 * for (Square square : squares) { System.out.println(square.toString());
		 * System.out.println(square.getArea()); System.out.println(square.getColor());
		 * sum += square.getArea(); }
		 * 
		 * Rectangle[] rectangles = { // new Rectangle(10, 5, "red"), // new
		 * Rectangle(11, 5, "blue") };
		 * 
		 * for (Rectangle r : rectangles) { System.out.println(r.toString());
		 * System.out.println(r.getArea()); System.out.println(r.getColor()); sum +=
		 * r.getArea(); }
		 */

//		Shape shape = new Shape("color");
//		shape.getArea();

		Shape[] shapes = { new Square(10, "red"), //
				new Square(11, "blue"), //
				new Rectangle(10, 5, "red"), //
				new Rectangle(11, 5, "blue"), //
				new Circle(10, "green") };

		for (Shape shape : shapes) {
			// asa NU
			if (shape instanceof Square) {
				((Square) shape).getArea();
			}
			if (shape instanceof Rectangle) {
				((Rectangle) shape).getArea();
			}
			if (shape instanceof Circle) {
				((Circle) shape).getArea();
			}
		}

		for (Shape shape : shapes) {
			// polimorfism
			System.out.println(shape.toString());
			sum += shape.getArea();
		}

		System.out.println(sum);
	}
}
