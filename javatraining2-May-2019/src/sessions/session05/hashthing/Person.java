package sessions.session05.hashthing;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.setName(name);
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + getName() + ", age=" + age + "]" + hashCode();
	}

	@Override
	public int hashCode() {
		return ((getName() == null) ? 0 : getName().hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (getName() == null) {
			if (other.getName() != null)
				return false;
		} else if (!getName().equals(other.getName()))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
