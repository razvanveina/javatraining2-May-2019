package sessions.session07;

import java.util.ArrayList;
import java.util.List;

import sessions.session05.hashthing.Person;

public class StreamsThing {
	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		strings.add("qwe");
		strings.add("asd");
		strings.add("zxc");

		strings.stream()//
				.filter(x -> x.startsWith("a"))//
				.forEach(s -> System.out.println(s));

		System.out.println(strings.parallelStream()//
				.allMatch(s -> s.length() == 3));

		List<Person> p = new ArrayList<>();
		p.add(new Person("Ion", 1));
		p.add(new Person("Gheo", 2));
		p.add(new Person("Mircea", 3));

		Person person = p.stream()//
				.filter(p1 -> p1.getName().equals("Ion"))//
				.findAny().get();

		System.out.println(person);

	}
}
