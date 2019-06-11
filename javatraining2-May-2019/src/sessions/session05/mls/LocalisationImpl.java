package sessions.session05.mls;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class LocalisationImpl implements Localisation {
	private Language currentLanguage;
	private Map<Language, Properties> messages = new HashMap<>();

	public LocalisationImpl() {
		setLanguage(Language.EN);
	}

	@Override
	public void setLanguage(Language language) {
		currentLanguage = language;

		if (messages.get(currentLanguage) == null) {
			String fileName = "messages_" + language.toString().toLowerCase() + ".txt";
			Properties prop = new Properties();
			try {
				prop.load(new FileInputStream(fileName));
				messages.put(currentLanguage, prop);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public String getMessage(String key) {
		Properties properties = messages.get(currentLanguage);

		String message = properties.getProperty(key);
		if (message == null) {
			return "!" + key;
		}
		return message;

	}

}
