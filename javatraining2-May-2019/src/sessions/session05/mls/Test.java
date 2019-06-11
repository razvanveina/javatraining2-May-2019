package sessions.session05.mls;

public class Test {
	public static void main(String[] args) {
		Localisation loc = new LocalisationImpl();
		loc.setLanguage(Language.RO);
		System.out.println(loc.getMessage("/chlang"));

		loc.setLanguage(Language.EN);
		System.out.println(loc.getMessage("/chlang"));
		System.out.println(loc.getMessage("/qwe"));
	}
}
