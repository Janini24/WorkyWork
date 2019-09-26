package main;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.SwingConstants;

public class potion{

public static void main(String[] args) {

	int value=0;	
	int gate=0;
Scanner j = new Scanner(System.in);
	

int onesPlace = value % 10;
int tensPlace = (value / 10) % 10;
int hundredPlace = (value / 100) % 10;
int thousandPlace = (value / 1000) % 10;


do {	
	while(!j.hasNextInt()) {

	System.out.println("Numbers only");
	j.next();		

	}
	value = j.nextInt();	

	if(value ==0) {

		System.out.println("Program Terminated!");
		System.exit(0);
	}else if( value > 9999) {
		System.out.println("Program only Accept values from (0-9999)");
	}else {
convertDigitToWord(value, "Tthousand");
	}


}while(gate == 0 );
System.out.println(value);	
}
	



public static void convertDigitToWord(int value, String name) {

	String uns[] = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
	String ten[] = { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"Eighteen", "Nineteen" };
	String tens[] = { "", "", "Twenty", "Thrirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
	String hun = "Hundred";
	String tho = "Thousand";
	
	
}

}
