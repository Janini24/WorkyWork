package exercises;


import java.util.Scanner;

public class C10R03 {
	private static Scanner j = new Scanner(System.in);
	private static String str = "";
	private static int numLen;

	private static final String MESSAGE1 = "Please input a String:";
	private static final String MESSAGEOUTPUT = "The middle character in the string :";
	private static final String MESSAGEOUTPUTS = "The middle characters in the string are :";

	public static void main(String[] args) {
		middle(str);
	}

	public static void middle(String str) {

		System.out.print(MESSAGE1);
		str = j.nextLine();

		numLen = str.length() - 1;

		if (((numLen / 2) + (numLen / 2) + 1) == numLen) {

//			System.out.println(MESSAGEOUTPUT + str.charAt((numLen / 2)));
			// System.out.println(MESSAGEOUTPUT + str.charAt((numLen / 2)+1));
		
			
			System.out.println(MESSAGEOUTPUTS + str.charAt((numLen / 2)) + str.charAt((numLen / 2) + 1));
		} else if (((numLen / 2) + (numLen / 2) + 1) != numLen) {
			System.out.println(MESSAGEOUTPUT + str.charAt((numLen / 2)));
		}

	}
}
