package sessions.session04.armylist;

import java.util.ArrayList;
import java.util.List;

public class Army {

	private List<Unit> units = new ArrayList<>();

	public void addUnit(Unit unit) {
		units.add(unit);
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
		return units.toString();
	}

	public void simulateLife(double probability) {
		for (Unit unit : units) {
			double random = Math.random();
			if (unit.isAlive() && random > probability) {
				unit.kill();
			}
		}
	}

	public void simulateLife(double probability, UnitType type) {
		for (Unit unit : units) {
			double random = Math.random();
			if (unit.getType().equals(type) && unit.isAlive() && random > probability) {
				unit.kill();
			}
		}
	}

	public int getFirepower(UnitType type) {
		int sum = 0;
		for (Unit unit : units) {
			if (unit.getType().equals(type) && unit.isAlive()) {
				sum += unit.getFirepower();
			}
		}
		return sum;
	}
}
