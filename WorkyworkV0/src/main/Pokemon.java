package main;
import java.util.Scanner;

public class Pokemon {
	public static void main(String[] args) {

		Event x = new Event();
//adasd
	}

}

class Event {
	Scanner j = new Scanner(System.in);
	String name, next;
	int choice;

	public Event() {
		gamePlay();

	}

	public void encounter() {

	}

	public void gamePlay() {

		System.out.print("Oh hi there! You must be new here?");
		next = j.nextLine();

		System.out.print("Are you a boy or a girl?");
		System.out.print("\n[1]Boy [2] Girl Choice:");

	
while(!j.hasNextInt()) {
		while(j.nextInt() !=1 || j.nextInt() !=1) {
			System.out.println();
			System.out.println("Again!");
			System.out.print("Are you a boy or a girl?");
			System.out.print("\n[1]Boy [2] Girl Choice:");

		choice = j.nextInt();
		}
		choice = j.nextInt();
		j.next();
//		choice = j.nextInt();
}

choice = j.nextInt();
		if (choice == 1) {

			System.out.println(" O");
			System.out.println("/|\\");
			System.out.println("/ \\");
		} else if (choice == 2) {

			System.out.println(" O");
			System.out.println("/|\\");
			System.out.println("/_\\");
		}

		System.out.print("Hello and welcome to the Pokemon World");
		next = j.nextLine();
		j.hasNextLine();

		System.out.println(" O");
		System.out.println("-|-");
		System.out.println("/ \\");
		System.out.print("Let's battle!!!");
	}

}