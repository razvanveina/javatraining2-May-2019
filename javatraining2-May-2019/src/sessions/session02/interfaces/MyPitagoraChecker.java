package sessions.session02.interfaces;

import java.io.Serializable;

public class MyPitagoraChecker extends Object implements PitagoraChecker, Serializable {

	@Override
	public boolean check(int a, int b, int c) {
		return a * a + b * b == c * c;
	}

	@Override
	public void metDefault() {
		PitagoraChecker.super.metDefault();
	}
}
