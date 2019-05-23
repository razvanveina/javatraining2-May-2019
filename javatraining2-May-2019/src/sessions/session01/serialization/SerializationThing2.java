package sessions.session01.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import sessions.session01.files.Person;

public class SerializationThing2 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Person[] persons = { //
				new Person("Ion", 20, true), //
				new Person("Gheo", 21, false), //
				new Person("Maria", 20, true) //
		};

		save(persons);
		Person[] x = load();
		System.out.println(x);
	}

	private static Person[] load() throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.ser"));

		Person[] result = (Person[]) ois.readObject();

		ois.close();

		return result;
	}

	private static void save(Person[] persons) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.ser"));

		oos.writeObject(persons);

		oos.close();
	}
}
