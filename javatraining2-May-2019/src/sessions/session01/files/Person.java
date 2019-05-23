package sessions.session01.files;

public class Person {
	private String name;
	private int age;
	private boolean glasses;

	public Person(String name, int age, boolean glasses) {
		super();
		this.name = name;
		this.age = age;
		this.glasses = glasses;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", glasses=" + glasses + "]";
	}

}
