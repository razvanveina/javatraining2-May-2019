package sessions.session02.tema;

public abstract class Unit {
	private String name;
	private boolean alive = true;

	public Unit(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return (alive ? "" : "+") + name + "(" + getFirepower() + ")";
	}

	public abstract int getFirepower();

	public void kill() {
		alive = false;
	}

	public boolean isAlive() {
		return alive;
	}
}
