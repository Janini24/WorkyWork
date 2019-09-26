package main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Mew {
	public static void main(String[] args) {

		List<String> store = new ArrayList<String>();

		store.add("Jolibi");
		store.add("Merkeri");
		store.add("Mang-Ina");
		store.add("McDidi");

		
		
		store.remove(2);
//		Collections.sort(store, new naturalOrder());

//		System.out.println(store);

		
//		System.out.println(store.get(2));
		for (String stores : store) {
			System.out.println(stores + " " + store.indexOf(stores));
		}

	}
}

class naturalOrder implements Comparator<String> {
	String s1, s2;

	@Override
	public int compare(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();

		if (len1 > len2) {
			return 1;
		} else if (len1 < len2) {
			return -1;
		}
		return 0;
	}

}