package exercises;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class C10R17 {
	private static double num1 = 0, num2 = 0, result = 0;
	private static Scanner j = new Scanner(System.in);
	private static char opt, con;

	private final static String MESSAGEINPUT1 = "Enter First Number :";
	private final static String MESSAGEINPUT2 = "Enter Second Number :";
	private final static String RESULT = "The result of this operation is :";
	private final static String DISPLAYVAR1 = "First Number:";
	private final static String DISPLAYVAR2 = "Second Number:";
	private final static String OPTION = "Select an option:";
	private final static String KEY = "\nPress any C key and press ENTER to continue";

	private final static String PROGRAMTERMINATE = "Program Terminated!";
	//private static double product, quotient, sum, difference;

	private final static String MENU = "\nM - Multiplication\n" + "D - Division\n" + "A - Addition\n"
			+ "S - Subtraction\n" + "Q - Quit\n";

	private final static String TITLE = "\n<<Math Operation menu>>";

	private static char MULTIPLICATION = 'M';

	public static void main(String[] args) {

		Display_Menu(num1, num2, opt);

	}

	public static void Display_Menu(double num1, double num2, char opt) {

		
		
		do {
		System.out.print(MESSAGEINPUT1);
		num1 = j.nextDouble();
		System.out.print(MESSAGEINPUT2);
		num2 = j.nextDouble();

		System.out.println(TITLE);
		System.out.printf("\n%s %.1f %s %.1f\n", DISPLAYVAR1, num1, DISPLAYVAR2, num2);
		System.out.println(MENU);
		System.out.print(OPTION);


		
		opt = j.next().charAt(0);
		System.out.println();
		
		
			if (opt == 'm' || opt == 'M') {
				Multiplication(num1, num2);

			} else if (opt == 'd' || opt == 'D') {
				Division(num1, num2);
			} else if (opt == 'a' || opt == 'A') {
				Addition(num1, num2);
			} else if (opt == 's' || opt == 'S') {
				subtraction(num1, num2);
			} else if (opt == 'q' || opt == 'Q') {
				System.out.println(PROGRAMTERMINATE);
				System.exit(0);
			}else {
				System.out.println("Not part of the option!!");
			}
			
			
			System.out.println(KEY);
			con = j.next().charAt(0);


			
	}while (con == 'C' || con == 'c');

		System.out.println(PROGRAMTERMINATE);

	}

	public static void Multiplication(double num1, double num2) {
		result = num1 * num2;
		System.out.println(RESULT + result);

	}

	public static void Division(double num1, double num2) {
		result = num1/num2;
		System.out.println(RESULT + result);
	}

	public static void Addition(double num1, double num2) {
		result = num1 + num2;
		System.out.println(RESULT + result);
	}

	public static void subtraction(double num1, double num2) {
		result = num1 * num2;
		System.out.println(RESULT + result);
	}

}
