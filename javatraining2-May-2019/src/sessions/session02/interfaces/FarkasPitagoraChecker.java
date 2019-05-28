package sessions.session02.interfaces;

public class FarkasPitagoraChecker implements PitagoraChecker {

	public static void main(String[] args) {
		// System.out.println(check(3, 4, 5));

	}

	@Override
	public boolean check(int a, int b, int c) {
		return ((a * a + b * b == c * c));
	}

}