package sessions.session05.hashthing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import sessions.session02.tema.Soldier;
import sessions.session02.tema.SuperSoldier;

public class Sorting {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("zxc");
		list.add("qwe");
		list.add("asd");

		Collections.sort(list);

		System.out.println(list);

		List<Soldier> list2 = new ArrayList<>();

		list2.add(new SuperSoldier("Thanos", 100));
		list2.add(new SuperSoldier("Rambo", 20));
		list2.add(new SuperSoldier("Chuck Norris", 30));

		Collections.sort(list2);
		System.out.println(list2);

		// aici facem o chestie

		Collections.sort(list2, new Comparator<Soldier>() {
			@Override
			public int compare(Soldier o1, Soldier o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		System.out.println(list2);

		Collections.sort(list2, new Comparator<Soldier>() { // clasa anonima
			@Override
			public int compare(Soldier o1, Soldier o2) {
				return o2.getName().compareTo(o1.getName());
			}
		});
		System.out.println(list2);

		Collections.sort(list2, new MyComparator());
		System.out.println(list2);

		List<String> mySpecialList = new ArrayList<String>() {
			@Override
			public String toString() {
				return "<" + super.toString() + ">";
			}
		};
		mySpecialList.add("qwe");
		System.out.println(mySpecialList.toString());
	}
}
