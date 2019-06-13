package sessions.session06.exceptions;

public class WithoutExceptions {
	public static void main(String[] args) {
		System.out.println(next(new int[] { 1, 2, 3, 4, 5 }, 4));
		System.out.println(next(new int[] { 1, 2, 3, 4, 5 }, 5));
		System.out.println(next(new int[] { 1, 2, 3, 4, 5 }, 6));
		System.out.println(next(new int[] { 1, 2, 3, 4, 5 }, -1));

		int testResult = next(new int[] { 1, 2, 3, 4, -2 }, 5);
		if (errorCode == 0) {
			System.out.println(testResult);
		} else {
			if (errorCode == -1) {
				System.out.println("Last element");
			}
			if (errorCode == -2) {
				System.out.println("Not found");
			}
		}

	}

	public static int errorCode = 0;

	public static int next(int[] arr, int n) {
		errorCode = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				if (i < arr.length - 1) {
					return arr[i + 1];
				} else {
					errorCode = -1;
					return -1;
				}
			}
		}
		errorCode = -2;
		return -2;
	}
}
