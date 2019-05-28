package sessions.session02.interfaces;

public interface PitagoraChecker {
	boolean check(int a, int b, int c);

	public static void metStatica() {
		System.out.println();
	}

	public default void metDefault() {
		System.out.println();
	}
}
