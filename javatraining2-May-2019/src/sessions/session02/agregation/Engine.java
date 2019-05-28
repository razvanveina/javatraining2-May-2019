package sessions.session02.agregation;

public class Engine {
	private String name;

	public Engine(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
