package sessions.session02.tema;

public class Soldier extends Unit implements Comparable<Soldier> {

	public Soldier(String name) {
		super(name, UnitType.SOLDIER);
	}

	@Override
	public int getFirepower() {
		return 1;
	}

	public String getName() {
		return name;
	}

//	@Override
//	public int compareTo(Soldier o) {
//		return this.name.compareTo(o.name);
//	}

	@Override
	public int compareTo(Soldier o) {
		return this.getFirepower() - o.getFirepower();
	}
}
