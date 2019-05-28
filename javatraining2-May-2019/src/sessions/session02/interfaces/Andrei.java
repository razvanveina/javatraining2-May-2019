package sessions.session02.interfaces;

public class Andrei implements PitagoraChecker {

	@Override
	public boolean check(int a, int b, int c) {

		return (a * a + b * b == c * c);
	}

}