package sessions.session02.tema;

public abstract class Unit {
	private String name;
	private boolean alive = true;
	private UnitType type;

	public Unit(String name, UnitType type) {
		super();
		this.name = name;
		this.type = type;
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

	public UnitType getType() {
		return type;
	}
}
