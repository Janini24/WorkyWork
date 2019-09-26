package exercises;


import java.util.Scanner;

public class C10R13 {

	private static double val1, val2, val3, area;
	private static double comp;
	private static Scanner j = new Scanner(System.in);
	private final static String SIDE1 = "Input Side-1 :";
	private final static String SIDE2 = "Input Side-2 :";
	private final static String SIDE3 = "Input Side-3 :";

	public static void main(String[] args) {

		calculateTriangle(val1, val2, val3);
	}

	public static void calculateTriangle(double val1, double val2, double val3) {

		System.out.print(SIDE1);
		val1 = j.nextInt();
		System.out.print(SIDE2);
		val2 = j.nextInt();
		System.out.print(SIDE3);
		val3 = j.nextInt();

		comp = (val1 + val2 + val3) / 2;
		area = Math.sqrt(comp * (comp - val1) * (comp - val2) * (comp - val3));

		System.out.println(area);
	}
}
