package sessions.session02.agregation;

public class Car {
	private String license;
	private Engine engine;

	public Car(String license, Engine engine) {
		super();
		this.license = license;
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [license=" + license + ", engine=" + engine + "]";
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
