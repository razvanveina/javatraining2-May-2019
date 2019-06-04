package sessions.session02.tema;

public class Soldier extends Unit {

	public Soldier(String name) {
		super(name);
	}

	@Override
	public int getFirepower() {
		return 1;
	}

}
