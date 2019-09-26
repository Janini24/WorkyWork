package main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class charmander{
	public static void main(String[] args) {

		List<String> attacks = new ArrayList<String>();
		
		attacks.add("Flamethrower");
		attacks.add("Water gun");
		attacks.add("Vine Whip");
		attacks.add("Tackle");
		attacks.add("Vine Whip");
		
		Collections.sort(attacks, new ReverseAlphabetStringCompare());
		
		for(String attack : attacks ) {
			System.out.println(attack);
		}

		
		
	}	
}

class ReverseAlphabetStringCompare implements Comparator<String>{

	@Override 
	public int compare(String s1, String s2) {

		return -s1.compareTo(s2);
	}

}

class StringCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {

		int len1 = s1.length();
		int len2 = s2.length();
		
		if (len1 > len2) {
			return 1;
		}else if(len1 < len2 ) {
			return -1;
		}
		
		return 0;
	}
	
}