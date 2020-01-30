package workshop3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Collections {

	public static void main(String[] args) {
		//List
		List<String> arrayList = new ArrayList<>();
		arrayList.add("caine");
		arrayList.add("pisica");
		arrayList.add("iepure");
		arrayList.add("caine");
		arrayList.forEach(element -> System.out.println(element));

		Set<String> treeSet = new TreeSet<>();
		treeSet.add("masina");
		treeSet.add("casa");
		treeSet.add("a");
		treeSet.add("masina");
		treeSet.forEach(element -> System.out.println(element));

		Set<String> hashSet = new HashSet<>();
		hashSet.add("masina");
		hashSet.add("casa");
		hashSet.add("a");
		hashSet.add("masina");
		System.out.println("--Hashset--");
		hashSet.forEach(elem -> System.out.println(elem));

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Doggo");
		map.put(2, "Cato");

		System.out.println(map);
		map.forEach((e1, e2) -> System.out.println(e1 + " .... "+e2));
	}
}
