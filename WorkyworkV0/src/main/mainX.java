package main;
import java.util.ArrayList;
import java.util.Scanner;

public class mainX{
	public static void main(String[] args) {

		Scanner j = new Scanner(System.in);

		int val;
		int gate = 0;
		
		do {
			
		
			if(j.hasNextInt()) {
		 val = j.nextInt();
			gate =1;
			}else {
				System.out.println("again!!!");
				 j.next();
				gate=0;
			}
		}while(!j.hasNextInt());
		
		
	}
}
		