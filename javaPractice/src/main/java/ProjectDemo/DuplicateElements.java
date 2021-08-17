package ProjectDemo;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		String name[] = { "s", "A", "U", "R", "A", "B", "H", "s" };

		// 1. Compare Each element: o(n*n)
		for (int i = 0; i < name.length; i++) {
			for (int j = i + 1; j < name.length; j++) {
				if (name[i].equals(name[j])) {
					System.out.println("Worst solution is :" + name[i]);
				}
			}

		}
		System.out.println("********************");

		// Using HashSet: it stores unique valueso(n)
		HashSet<String> store = new HashSet<String>();
		for (String names : name) {
			if (store.add(names) == false) {
				System.out.println("Hashsetsolution is :" + names);
			}
		}
		System.out.println("********************");

		// 3. Using HashMap:o(2n)

		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		for (String names : name) {
			Integer count = storeMap.get(name);
			if (count == null) {
				storeMap.put(name, 1);
			}
			else {
				storeMap.put(name, ++count);
			}
		}
		//get the value from this HashMap
		Set<Entry<String, Integer>> entryset = storeMap.entrySet();
		for(Entry<String, Integer>entry:entryset) {
			if(entry.getValue()>1) {
				System.out.println("HashMpa solution:"+ entry.getValue);
			}
		}
	}

}
