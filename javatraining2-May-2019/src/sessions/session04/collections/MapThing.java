package sessions.session04.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapThing {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Noemi", 21);
		map.put("Chuck Norris", 77);
		map.put("Noemi", 21);
		map.put("Razvan", -1);

		Integer value = map.get("Noemi");
		System.out.println(value);

		System.out.println(map.containsKey("Noemi"));
		System.out.println(map.containsValue(-1));
		System.out.println(map.replace("Noemi", 21, 22));

		int sum = 0;
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry);
			sum += entry.getValue();
		}
		System.out.println(sum);
		System.out.println(map.remove("Razvan", -1));
		System.out.println(map.toString());

		System.out.println(map.get("non existent key"));

		for (Integer v : map.values()) {
			System.out.println(v);
		}

	}
}
