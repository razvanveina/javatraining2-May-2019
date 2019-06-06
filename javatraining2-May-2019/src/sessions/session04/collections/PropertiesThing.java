package sessions.session04.collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesThing {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		prop.load(new FileInputStream("messages_ro.txt"));
		System.out.println(prop.getProperty("/chlang"));
		System.out.println(prop.getProperty("/chlang1", "!/chlang1"));

	}
}
