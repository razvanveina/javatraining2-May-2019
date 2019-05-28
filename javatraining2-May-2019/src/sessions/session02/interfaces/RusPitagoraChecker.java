package sessions.session02.interfaces;

public class RusPitagoraChecker implements PitagoraChecker {

	@Override
	public boolean check(int a, int b, int c) {
		if (a * a + b * b == c * c) {
			return true;
		} else {

			return false;
		}

	}

}