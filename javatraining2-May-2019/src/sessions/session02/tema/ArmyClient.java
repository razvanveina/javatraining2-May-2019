package sessions.session02.tema;

public class ArmyClient {
	public static void main(String[] args) {
		Unit[] units1 = { //
				new SuperSoldier("Chuck Norris", 2000), //
				new SuperSoldier("Rambo", 2000) //
		};

		Unit[] units2 = { //
				new Soldier("Ghita"), //
				new Soldier("Ion"), //
				new Tank("Scorpionul Rosu", 11, 500), //
				new Tank("Furry", 11, 500) };

		Army army1 = new Army(units1);
		Army army2 = new Army(units2);

		System.out.println(army1.toString());
		System.out.println(army2.toString());

		System.out.println(army1.getFirepower());
		System.out.println(army2.getFirepower());

		BattleSimulator bs = new BattleSimulator(army1, army2);
		bs.simulate();
	}

}
