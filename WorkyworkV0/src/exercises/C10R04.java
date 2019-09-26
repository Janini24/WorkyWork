package exercises;


import java.util.Scanner;

public class C10R04 {
	private static String str;
	
	private static final String MESSAGE = "Please input a string:";
	private static final String MESSAGEOUTPUT = "Number of Vowels in the string:";
	private static Scanner j = new Scanner(System.in);
	private static int numVowel;
	
	public static void main(String[] args) {

	vowels(str);
	
}

public static void vowels(String str) {
	
	System.out.print(MESSAGE);
	str = j.nextLine();

	str = str.toLowerCase();   
	int strLen = str.length();


for(int x =0; x<strLen; x++) {
	
 if(str.charAt(x) == 'a' || str.charAt(x) == 'e' || str.charAt(x) == 'i' || str.charAt(x) == 'o' || str.charAt(x) == 'u') {
	 numVowel++;
 }
}
		
	
			
	

	System.out.println(MESSAGEOUTPUT + numVowel);

}
}
