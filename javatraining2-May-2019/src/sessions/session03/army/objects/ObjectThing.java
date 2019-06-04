package sessions.session03.army.objects;

import sessions.session02.tema.Soldier;

public class ObjectThing {
	public static void main(String[] args) {
		Soldier s1 = new Soldier("qwe");
		Soldier s2 = new Soldier("qwe");

		System.out.println(s1.getClass().getName());
		System.out.println(s1.toString());

		System.out.println(s1.equals(s2));

		System.out.println(s1 == s2);
	}
}
