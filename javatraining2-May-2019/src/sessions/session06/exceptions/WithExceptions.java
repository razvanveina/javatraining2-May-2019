package sessions.session06.exceptions;

public class WithExceptions {

	public static void main(String[] args) {
//		System.out.println(next(new int[] { 1, 2, 3, 4, 5 }, 4));
//		System.out.println(next(new int[] { 1, 2, 3, 4, 5 }, 5));
//		System.out.println(next(new int[] { 1, 2, 3, 4, 5 }, 6));
//		System.out.println(next(new int[] { 1, 2, 3, 4, 5 }, -1));

		try {
			int testResult = next(new int[] { 1, 2, 3, 4, -2 }, -2);
			System.out.println(testResult);
		} catch (LastElementException e) {
			System.out.println("Last element");
		} catch (NotFoundException e) {
			System.out.println("Not found");
		} finally {
			System.out.println("Se executa intotdeauna");
		}

	}

	public static int next(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				if (i < arr.length - 1) {
					return arr[i + 1];
				} else {
					throw new LastElementException();
				}
			}
		}
		throw new NotFoundException();
	}

}
