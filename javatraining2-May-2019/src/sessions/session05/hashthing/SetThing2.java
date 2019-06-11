package sessions.session05.hashthing;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetThing2 {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();

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
