package sessions.session01.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import sessions.session01.files.Person;

public class SerializationThing {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Person ion = new Person("Ion", 30, false);
		save(ion);
		Person x = load();
		System.out.println(x);
	}

	private static Person load() throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.ser"));

		Person result = (Person) ois.readObject();

		ois.close();

		return result;
	}

	private static void save(Person ion) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.ser"));

		oos.writeObject(ion);

		oos.close();
	}
}
