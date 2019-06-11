package sessions.session05.mls;

public interface Localisation {
	void setLanguage(Language language);

	String getMessage(String key);
}
