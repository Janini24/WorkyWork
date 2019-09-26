package main;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class demo {
	public static void main(String[] args) {

		int index = 0;
		Map<Integer, String> map = new HashMap<Integer, String>();
		Scanner j = new Scanner(System.in);
		String name;
		int x;

		do {
			System.out.println("Input name type 'no' to finish inputting");
			name = j.nextLine();


			
			if (!name.equalsIgnoreCase("no")) {
				//map.remove(index, name);

				map.put(index, name);
			}
			index++;

			

		} while (!name.equalsIgnoreCase("no"));

		
		System.out.println("Here are the list of names...");
		for (Integer i : map.keySet()) {
			String listName = map.get(i);

			System.out.println(listName);
		}

	}

}