package sessions.session04.armylist;

public class ArmyClient {
	public static void main(String[] args) {
		Army army1 = new Army();
		army1.addUnit(new SuperSoldier("Chuck Norris", 2000));
		army1.addUnit(new SuperSoldier("Rambo", 2000));

		Army army2 = new Army();
		army2.addUnit(new Soldier("Ghita"));
		army2.addUnit(new Soldier("Ion"));
		army2.addUnit(new Tank("Scorpionul Rosu", 11, 500));
		army2.addUnit(new Tank("Furry", 11, 500));

		System.out.println(army1.toString());
		System.out.println(army2.toString());

		System.out.println(army1.getFirepower());
		System.out.println(army2.getFirepower());

		BattleSimulator bs = new BattleSimulator(army1, army2);
		bs.simulate();
	}

}
