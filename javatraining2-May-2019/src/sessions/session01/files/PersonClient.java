package sessions.session01.files;

public class PersonClient {
	public static void main(String[] args) {
		Person[] persons = { //
				new Person("Ion", 20, true), //
				new Person("Gheo", 21, false), //
				new Person("Maria", 20, true) //
		};
		save(persons);
		persons = load();
	}

	private static Person[] load() {
		return null;
	}

	private static void save(Person[] persons) {

	}

}
