package exercises;


import java.util.Scanner;

public class NumToWordConverter{
	private static final String  MESSAGE = "Please input a value:";	
	public static void main(String[] args) {

		int value;
		Scanner j = new Scanner(System.in);
		
		System.out.println(MESSAGE);
		value = j.nextInt();
		
		while(value != 0) {

			if(value > 0 && value <=9999) {
				convert((value/1000)%100, " Thousand ");
				convert((value/100)%10, " Hundred " );
				convert((value %100), " ");
			}else {
				System.out.println("We only accept values from (1-9999)");
			}
			System.out.println();			
			System.out.print(MESSAGE);
			value = j.nextInt();

		}

		System.out.println("Program Terminated!");
		
		
	}
	
	public static void convert(int value, String name) {
		
		String one[] = {"", "One","Two","Three","Four","Five","Six","Seven","Eight","Nine", "Ten", "Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
		String tens[] = {"", "", "Twenty","Thrirty", "Fourty",  "Fifty",  "Sixty",  "Seventy",  "Eighty",  "Ninety"};

		
		
		//System.out.println(value + name);

		
		if(value > 19) {
			System.out.print(tens[value/10] + " " + one[value%10]);
		}else {
			System.out.print(one[value]); 
			
		}
		
		if(value > 0) {
			System.out.print(name);
			
		}
	}
	
}

