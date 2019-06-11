package sessions.session05.hashthing;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetThing3 {
	public static void main(String[] args) {
		Set<Person> set = new TreeSet<>();

		set.add(new Person("Ion", 22));
		set.add(new Person("Paul", 23));

		System.out.println(set);

		Iterator<Person> iterator = set.iterator();

		while (iterator.hasNext()) {
			Person s = iterator.next();
			System.out.println(s);
		}

		Person persoanaCautata = new Person("Ion", 24);
		System.out.println(persoanaCautata);
		System.out.println(set.contains(persoanaCautata));

	}
}
