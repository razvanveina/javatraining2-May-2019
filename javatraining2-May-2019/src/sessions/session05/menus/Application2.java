package sessions.session05.menus;

public class Application2 {
	public static void main(String[] args) {
		Menu mainMenu = new Menu("", "");
		Menu changeLanguageMenu = new Menu("1", "/chlang");
		mainMenu.addMenuItem(changeLanguageMenu);
		MenuItem exitMenu = new MenuItem("0", "/exit") {
			@Override
			public void doAction() {
			}
		};
		mainMenu.setBackAction(exitMenu);
		mainMenu.addMenuItem(exitMenu);

		mainMenu.doAction();
	}
}
