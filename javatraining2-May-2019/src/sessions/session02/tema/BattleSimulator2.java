package sessions.session02.tema;

public class BattleSimulator2 {
	private Army army1;
	private Army army2;

	public BattleSimulator2(Army army1, Army army2) {
		super();
		this.army1 = army1;
		this.army2 = army2;
	}

	public void simulate() {
		while (true) {

			for (UnitType type : UnitType.values()) {
				int fp1 = army1.getFirepower(type);
				int fp2 = army2.getFirepower(type);

				int totalFp = fp1 + fp2;

				army1.simulateLife((double) fp1 / totalFp, type);
				army2.simulateLife((double) fp2 / totalFp, type);
			}

			System.out.println(army1);
			System.out.println(army2);

			if (!army1.isAlive() || !army2.isAlive()) {
				break;
			}
		}
	}
}
