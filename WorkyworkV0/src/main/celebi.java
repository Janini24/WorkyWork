package main;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class celebi {
	public static void main(String[] args) {

		Zubat zubs = new Zubat();
		zubs.brainz();

	}
}

class Zubat {
	Scanner j = new Scanner(System.in);
	String name;
	int val, id =1;

	Info info[] = { new Info(val, name) };
	List<Info> infoList = new ArrayList<Info>();
	
	
	
	public void brainz() {
		soulz();

	}

	public void soulz() {

		System.out.print("Please insert a value:");
		val = j.nextInt();

		while (val != 0) {

			if (val == 2) {

			}

			System.out.print("Please insert a value:");
			val = j.nextInt();

		}

		System.out.println("Program Terminated");
	}

	public void addEmployee() {
		System.out.print("Please add an Employee:");
		name = j.next();
		
	

	}

}

class Info {

	public Info( int id, String name) {
	System.out.println(name + ": " + id);

	}
}
