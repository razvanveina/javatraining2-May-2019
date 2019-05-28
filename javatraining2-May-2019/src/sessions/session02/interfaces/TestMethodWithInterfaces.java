package sessions.session02.interfaces;

public class TestMethodWithInterfaces {
	public static void main(String[] args) {
		PitagoraChecker[] implementations = { //
				new MyPitagoraChecker(), //
				new Andrei(), //
				new AlexPitagora(), //
				new FarkasPitagoraChecker(), //
				new BogdanPitagora(), //
				new RusPitagoraChecker()//
		};

		int success = 0;

		for (PitagoraChecker pc : implementations) {
			success += (pc.check(3, 4, 5) ? 1 : 0);
			success += (pc.check(3, 4, 15) ? 0 : 1);
			success += (pc.check(13, 14, 15) ? 0 : 1);
		}

		System.out.println("Success: " + (success * 100 / (3 * implementations.length)) + "%");
	}
}
