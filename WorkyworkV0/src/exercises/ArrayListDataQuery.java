package exercises;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

public class ArrayListDataQuery {
	public static void main(String[] args) {

		Actions act = new Actions();
		String name="";

		Scanner j = new Scanner(System.in);
		int choice;
		boolean next = true;

		System.out.println("Please choose an Action");
		System.out.println("Actions:");
		System.out.println("[0] - to Shutdown" + "\n[1] - to Print personal information(id, name, age, sex"
				+ "\n[2] - Add a new employee details" + "\n[3] - to Update an existing employee details"
				+ "\n[4] - to Remove an existing employee" + "\n[5] - Query for existing employee"
				+ "\n[6] - to Print a list of available actions");

		System.out.print("Choice:");

		choice = j.nextInt();
		System.out.println();

		while (choice != 0) {

			if (choice == 1) {
				if (next) {
					act.displayPersonalInformation();
				} else if (!next) {
					System.out.println("This Action is not Available Yet!!!");
				}

			} else if (choice == 2) {

				
				act.addEmployeeDetail();
				
			//	act.get();
			}else if(choice == 3) {
				act.updateQuery();
		}else if(choice == 4){
				act.removeQuery();
			
		}else if(choice == 5) {
				act.queryExistEmployee();
		}else if(choice == 6) {
			System.out.println();
			System.out.println("\nPlease choose an Action");
		System.out.println("Actions:");
			System.out.println("[0] - to Shutdown" + "\n[1] - to Print personal information(id, name, age, sex"
					+ "\n[2] - Add a new employee details" + "\n[3] - to Update an existing employee details"
					+ "\n[4] - to Remove an existing employee" + "\n[5] - Query for existing employee"
					+ "\n[6] - to Print a list of available actions");
	
		}
			//System.out.println("\nPlease refer for Action[6] for some available actions!!!");
		
			System.out.print("\nPlease choose an Action");
			choice = j.nextInt();
			System.out.println();

		




	}
		System.out.println("Program Terminated");
}
}

class Actions {
	int id, age, val;
	String name, sex;

	//String personInfo[] = {String.valueOf(id), name, String.valueOf(age), sex};
//	String personInfo[][] = {String.valueOf(id), name, String.valueOf(age), sex};
//String personArr[][] = new String[10][2];
Map<Integer, String> personArr = new LinkedHashMap<Integer, String>();

	
	Scanner j = new Scanner(System.in);

	public void addEmployeeDetail() {
		System.out.print("Please insert name:");
		name = j.next();	
		
		
		personArr.put(id, name);
		id++;
	}
	
	public void displayPersonalInformation() {
		for(Integer i : personArr.keySet()) {
			 String callName = personArr.get(i);
	System.out.printf("Id:%d\nName:%s\n", i, callName);
	}
	}
	
	public void queryExistEmployee() {
		System.out.println("Please choose an Id:");
		val = j.nextInt();
	}
	
	public void removeQuery() {
		System.out.println("Please choose an Id to be removed:");
		val = j.nextInt();
		
		personArr.remove(val);
		System.out.println("ID:" + val + "Succesfully Removed!");
		
	}
	
	public void updateQuery() {
	

		System.out.println("Please enter a name:");

		String newName = j.next();
		
		
personArr.put(val, newName);
		
	}
	
	
	


}

