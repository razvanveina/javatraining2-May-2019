package sessions.session02.tema;

import java.util.Arrays;

public class Army {

	private Unit[] units;

	public Army(Unit[] units) {
		this.units = units;
	}

	public int getFirepower() {
		int sum = 0;
		for (Unit unit : units) {
			if (unit.isAlive()) {
				sum += unit.getFirepower();
			}
		}
		return sum;
	}

	public boolean isAlive() {
		return getFirepower() > 0;
	}

	@Override
	public String toString() {
		return Arrays.toString(units);
	}

	public void simulateLife(double probability) {
		for (Unit unit : units) {
			double random = Math.random();
			if (unit.isAlive() && random > probability) {
				unit.kill();
			}
		}
	}
}
