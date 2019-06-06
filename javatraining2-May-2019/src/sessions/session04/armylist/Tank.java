package sessions.session04.armylist;

public class Tank extends Unit {

	private int projectiles;
	private int bullets;

	public Tank(String name, int projectiles, int bullets) {
		super(name, UnitType.TANK);
		this.projectiles = projectiles;
		this.bullets = bullets;
	}

	@Override
	public int getFirepower() {
		return projectiles * 50 + bullets;
	}

}
