package sessions.session02.tema;

public abstract class Unit {
	protected String name;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Unit other = (Unit) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

//	@Override
//	public boolean equals(Unit obj) {
//		return false;
//	}

}
