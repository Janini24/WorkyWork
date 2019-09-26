package exercises;


import java.util.Scanner;

public class C10R06 {
	private static int sum;
	private static String num;
	private static String[] strSplit;
	private static final String MESSAGE = "Input an integer :";
	private static final String MESSAGEOUTPUT = "The sum is :";
	private static Scanner j = new Scanner(System.in);

	public static void main(String[] args) {

	sumDigit();

	}

	public static void sumDigit() {

		
		System.out.print(MESSAGE);
		num = j.nextLine();

		strSplit = num.split("");
		for (int x = 0; x < num.length(); x++) {

			int strParseSplit = Integer.parseInt(strSplit[x]);
			sum += strParseSplit;

		}
		System.out.println(MESSAGEOUTPUT + sum);
	}

}
