package exercises;


import java.util.Random;
import java.util.Scanner;

public class C10R12 {

	private static int val;
	private static final String MESSAGE = "Input a number:"; 
	private static Scanner j = new Scanner(System.in);
	private static Random random = new Random();
	
	
	
	public static void main(String[] args) {
displayMatrix(val);
}

public static void displayMatrix(int val) {
	
	System.out.print(MESSAGE);
	val = j.nextInt();

	
	for(int y = 0; y < val; y++) {
	System.out.println();
		for(int x = 0; x < val;x++) {
		System.out.print(random.nextInt(2));
	}
	}

}
}
