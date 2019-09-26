package exercises;


import java.util.Scanner;

public class C10R01 {
	private static int n1, n2, n3, smallest;
	private static double average;
	private static String MESSAGE1 = "Input the First number :";
	private static final String MESSAGE2 = "Input the Second number :";
	private static final String MESSAGE3 = "Input the Third number :";
	private static final String MESSAGEOUTPUT = "\nThe smallest value is :";
	private static final Scanner j = new Scanner(System.in);

	public static void main(String[] args) {
		smallest(n1, n2, n3);

	}

	public static void smallest(int n1, int n2, int n3) {

		System.out.print(MESSAGE1);
		n1 = j.nextInt();
		System.out.print(MESSAGE2);
		n2 = j.nextInt();
		System.out.print(MESSAGE3);
		n3 = j.nextInt();

		if (n1 < n2) {
			smallest = n1;
		} else {
			smallest = n2;
		}
		if (n3 < smallest) {
			smallest = n3;
		}
		System.out.println(MESSAGEOUTPUT + smallest);
	}

	public static void average(int n1, int n2, int n3) {

		System.out.print(MESSAGE1);
		n1 = j.nextInt();
		System.out.print(MESSAGE2);
		n2 = j.nextInt();
		System.out.print(MESSAGE3);
		n3 = j.nextInt();

		average = (n1 + n2 + n3) / 3;

		System.out.println("\nThe average value is :" + average);

	}

}
