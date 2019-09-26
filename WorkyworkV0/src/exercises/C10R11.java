package exercises;


import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

public class C10R11 {

	private static final String MESSAGE = "[Rules] \n" + "1. A password must have at least ten characters.\n"
			+ "2. A password consists of only letters and digits.\n"
			+ "3. A password must contain at least two digits. ";

	private static final String MESSAGEINPUT = "Input a password(You are agreeing to the above Terms and Conditions.):";
	private static final String MESSAGEINVALID = "Password is not valid:";
	private static final String MESSAGEVALID = "Password is valid:";
	
	private static char passChar;
	private static String password;
	private static Scanner j = new Scanner(System.in);
	private static int digits;
	private static int letters;

	public static void main(String[] args) {

		checkPassword(password);

	}

	public static void checkPassword(String password) {

		System.out.println(MESSAGE);
		System.out.print(MESSAGEINPUT);
		password = j.nextLine();

		String splitPassword[] = password.split("");

		for (int x = 0; x < password.length(); x++) {
		//int splitParsePassword = Integer.parseInt(splitPassword[x]);

			passChar = password.charAt(x);
			
			if(hasNumber(passChar)) {
				digits++;
			
			}else if(hasLetters(passChar)) {
				letters++;
			}


		}
//	System.out.println(digits);
		
//		System.out.println(letters);
	
		if(password.length() < 8) {
			System.out.println(MESSAGEINVALID+password);
		}else if(digits < 2) {
			System.out.println(MESSAGEINVALID+password);
		}else if(digits >2 && letters > 1) {
			System.out.println(MESSAGEVALID+password);
		}
		
	}
	

	public static boolean hasNumber(char passChar) {

		return (passChar >= '0' && passChar <= '9');
		
	}
	
	public static boolean hasLetters(char passChar) {
		   passChar = Character.toUpperCase(passChar);
		return (passChar >= 'A' && passChar <= 'Z');
		
	}
}