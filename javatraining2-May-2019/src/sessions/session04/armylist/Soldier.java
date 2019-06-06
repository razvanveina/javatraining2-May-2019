package sessions.session04.armylist;

public class Soldier extends Unit {

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

}
