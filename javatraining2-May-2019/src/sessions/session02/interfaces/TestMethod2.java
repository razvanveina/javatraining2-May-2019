package sessions.session02.interfaces;

public class TestMethod2 {
	public static void main(String[] args) {
		int success = 0;

		success += (Pitagora.verification(3, 4, 5) ? 1 : 0);
		success += (Pitagora.verification(3, 4, 15) ? 0 : 1);
		success += (Pitagora.verification(13, 14, 15) ? 0 : 1);

		System.out.println("Success: " + (success * 100 / 3) + "%");
	}

	public static boolean test(int a, int b, int c) {
		return true;
	}
}
