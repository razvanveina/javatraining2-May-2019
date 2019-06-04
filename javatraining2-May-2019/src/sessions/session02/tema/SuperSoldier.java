package sessions.session02.tema;

public class SuperSoldier extends Soldier {

	private int firepower;

	public SuperSoldier(String name, int firepower) {
		super(name);
		this.firepower = firepower;
	}

	@Override
	public int getFirepower() {
		return firepower;
	}

}
