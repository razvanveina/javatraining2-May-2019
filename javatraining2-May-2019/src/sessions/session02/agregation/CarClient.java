package sessions.session02.agregation;

public class CarClient {
	public static void main(String[] args) {
		Engine en1 = new DieselEngine();
		Car car1 = new Car("qweqwe", en1);
		System.out.println(car1.toString());

		Engine en2 = new GasolineEngine();
		Car car2 = new Car("asdfsdf", en2);
		System.out.println(car2.toString());

		car1.setEngine(en2);
		System.out.println(car1.toString());

	}
}
