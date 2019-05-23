package sessions.session01;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String s = "123,234,345";
		// Integer.parseInt(s);
		String[] splits = s.split(",");
		System.out.println(Arrays.toString(splits));

		for (int i = 0; i < splits.length; i++) {
			System.out.println(splits[i]);
		}

		for (String ss : splits) {
			System.out.println(ss);
		}
	}
}
