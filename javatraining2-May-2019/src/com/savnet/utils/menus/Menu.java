package com.savnet.utils.menus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu extends MenuItem {
	private List<MenuItem> items = new ArrayList<>();
	private MenuItem backAction;
	Scanner scanner = new Scanner(System.in);

	public Menu(String key, String option) {
		super(key, option);
	}

	public void addMenuItem(MenuItem item) {
		items.add(item);
	}

	@Override
	public void doAction() {
		while (true) {
			showMenu();
			System.out.print(">");
			String option = scanner.nextLine();
			MenuItem item = getMenuItemByOption(option);

			if (item == null) {
				System.out.println("Invalid option");
				continue;
			}

			if (item == backAction) {
				return;
			}
			item.doAction();
		}
	}

	private MenuItem getMenuItemByOption(String option) {
		for (MenuItem item : items) {
			if (item.getOption().equals(option)) {
				return item;
			}
		}
		return null;
	}

	private void showMenu() {
		for (MenuItem item : items) {
			System.out.println(item);
		}
	}

	public void setBackAction(MenuItem backAction) {
		this.backAction = backAction;
	}

}
