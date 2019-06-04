package sessions.session02.tema.objects;

import sessions.session02.tema.Soldier;

public class ObjectThing {
	public static void main(String[] args) {
		Soldier s = new Soldier("qwe");
		System.out.println(s.getClass().getName());
	}
}
