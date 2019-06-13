package sessions.session05.menus;

import sessions.session05.mls.Language;

public class Application2 {
	public static void main(String[] args) {
		Menu mainMenu = new Menu("", "");

		Menu changeLanguageMenu = new Menu("1", "/chlang");

		MenuItem setEnglishMenu = new MenuItem("1", "/en") {
			@Override
			public void doAction() {
				MultilanguageSession.mls.setLanguage(Language.EN);
			}
		};

		changeLanguageMenu.addMenuItem(setEnglishMenu);

		MenuItem setRomanianMenu = new MenuItem("2", "/ro") {
			@Override
			public void doAction() {
				MultilanguageSession.mls.setLanguage(Language.RO);
			}
		};
		changeLanguageMenu.addMenuItem(setRomanianMenu);
		MenuItem backMenu = new BackMenu("0", "/back");
		changeLanguageMenu.addMenuItem(backMenu);
		changeLanguageMenu.setBackAction(backMenu);
		mainMenu.addMenuItem(changeLanguageMenu);
		MenuItem exitMenu = new BackMenu("0", "/exit");
		mainMenu.addMenuItem(exitMenu);
		mainMenu.setBackAction(exitMenu);

		mainMenu.doAction();
	}
}
