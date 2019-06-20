package sessions.session07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaThing {
	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		strings.add("qwe");
		strings.add("asd");
		strings.add("zxc");

		System.out.println(strings);

		Comparator<String> comparator1 = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};

		Comparator<String> comparator3 = new Comparator<String>() {
			@Override
			public int compare(String qweqew, String sdasfas) {
				return sdasfas.compareTo(qweqew);
			}
		};

		Comparator<String> comparator2 = (o1, o2) -> {
			return o1.compareTo(o2);
		};

		Comparator<String> comparator22 = (o1, o2) -> o1.compareTo(o2);

		Collections.sort(strings, comparator1);

		System.out.println(strings);
	}
}
