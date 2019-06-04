package sessions.session03.collections;

import java.util.ArrayList;
import java.util.List;

import sessions.session02.tema.Soldier;

public class ListThing2 {
	public static void main(String[] args) {
		List<Soldier> list = new ArrayList<>();

		list.add(new Soldier("Chuck Norris"));
		list.add(new Soldier("Rambo"));
		list.add(new Soldier("Thanos"));
		// list.add(new Integer(5));

		System.out.println(list.toString());
		list.add(0, new Soldier("Terminator"));
		System.out.println(list.toString());

		list.remove(0);
		System.out.println(list.toString());
		list.remove(new Soldier("Chuck Norris"));
		System.out.println(list.toString());
		list.addAll(list);
		System.out.println(list.toString());
//		list.clear();
//		System.out.println(list.toString());
		System.out.println(list.contains(new Soldier("Rambo")));
		System.out.println(list.contains("asd1"));
		System.out.println(list.get(0));
		System.out.println(list.get(list.size() - 1));
		System.out.println(list.indexOf("asd"));
		System.out.println(list.isEmpty());
		list.set(0, new Soldier("Rambo"));
		System.out.println(list);
		List<Soldier> list2 = list.subList(1, 3);
		System.out.println(list2);
	}
}
