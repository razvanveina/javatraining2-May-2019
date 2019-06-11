package sessions.session05.hashthing;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetThing {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		set.add("qwe");
		set.add("qwe");
		set.add("qwe");
		set.add("asd");
		set.add("zxc");

		System.out.println(set);

		Iterator<String> iterator = set.iterator();

		while (iterator.hasNext()) {
			String s = iterator.next();
			System.out.println(s);
		}

		System.out.println(set.contains("qwe"));

		Set<String> set2 = new TreeSet<>();

		set2.add("qwe");
		set2.add("qwe");
		set2.add("qwe");
		set2.add("asd");
		set2.add("zxc");

		System.out.println(set2);
	}
}
