package sessions.session05.mls;

import java.util.Scanner;

public class Application {
	private Localisation loc = new LocalisationImpl();
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Application app = new Application();
		app.run();

	}

	private void run() {
		while (true) {
			showMenu();
			System.out.print(">");
			String option = scanner.nextLine();
			switch (option) {
			case "1":
				changeLanguage();
				break;
			case "0":
				return;
			}
		}
	}

	private void changeLanguage() {
		while (true) {
			showChangeLanguageMenu();
			System.out.print(">");
			String option = scanner.nextLine();
			switch (option) {
			case "1":
				loc.setLanguage(Language.EN);
				break;
			case "2":
				loc.setLanguage(Language.RO);
				break;
			case "0":
				return;
			}
		}
	}

	private void showChangeLanguageMenu() {
		System.out.println("1. " + loc.getMessage("/en"));
		System.out.println("2. " + loc.getMessage("/ro"));
		System.out.println("0. " + loc.getMessage("/back"));

	}

	private void showMenu() {
		System.out.println("1. " + loc.getMessage("/chlang"));
		System.out.println("0. " + loc.getMessage("/exit"));
	}
}
