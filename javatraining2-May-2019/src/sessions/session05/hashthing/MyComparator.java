package sessions.session05.hashthing;

import java.util.Comparator;

import sessions.session02.tema.Soldier;

public class MyComparator implements Comparator<Soldier> {
	@Override
	public int compare(Soldier o1, Soldier o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
