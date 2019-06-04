package sessions.session03.collections;

import java.util.ArrayList;
import java.util.List;

public class ListThing {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("qwe");
		list.add("asd");
		list.add("zxc");
		// list.add(new Integer(5));

		System.out.println(list.toString());
		list.add(0, "ert");
		System.out.println(list.toString());
		list.remove(1);
		System.out.println(list.toString());
		list.remove("ert");
		System.out.println(list.toString());
		list.addAll(list);
		System.out.println(list.toString());
//		list.clear();
//		System.out.println(list.toString());
		System.out.println(list.contains("asd"));
		System.out.println(list.contains("asd1"));
		System.out.println(list.get(0));
		System.out.println(list.get(list.size() - 1));
		System.out.println(list.indexOf("asd"));
		System.out.println(list.isEmpty());
		list.set(0, "---");
		System.out.println(list);
		List<String> list2 = list.subList(1, 3);
		System.out.println(list2);
	}
}
