package sessions.session02.interfaces;

public class Pitagora {

	public static boolean verification(int a, int b, int c) {

		return (a * a + b * b == c * c);
	}

	public static void main(String[] args) {
		System.out.println(verification(3, 4, 5));
	}
}