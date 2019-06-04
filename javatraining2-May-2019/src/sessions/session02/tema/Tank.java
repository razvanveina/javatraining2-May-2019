package sessions.session02.tema;

public class Tank extends Unit {

	private int projectiles;
	private int bullets;

	public Tank(String name, int projectiles, int bullets) {
		super(name);
		this.projectiles = projectiles;
		this.bullets = bullets;
	}

	@Override
	public int getFirepower() {
		return projectiles * 50 + bullets;
	}

}
