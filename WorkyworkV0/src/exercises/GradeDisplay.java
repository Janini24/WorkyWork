package exercises;


public class GradeDisplay {
	public static void main(String[] args) {
		
		double gs;
		String Grade[] = new String[5];
		

//		(gs[y]=(prelim[y]*0.3)+(midterm[y]*0.3)+(finals[y]*.4))
		
		//Grade
		Grade[0] = "Name"; Grade[1] = "Prelim";Grade[2] = "Midterm";Grade[3] = "Final";Grade[4] = "Grade";
		print(Grade);
		
		Grade[0] = "Justin"; Grade[1] = "88"; Grade[2] = "90"; Grade[3] = "88";
		gs =(Integer.parseInt(Grade[1])*0.3 + Integer.parseInt(Grade[2])*0.3 + Integer.parseInt(Grade[3])*0.4);
		Grade[4] =String.valueOf(gs);
		print(Grade);

		Grade[0] = "Lorenz"; Grade[1] = "90"; Grade[2] = "88"; Grade[3] = "92";
		gs =(Integer.parseInt(Grade[1])*0.3 + Integer.parseInt(Grade[2])*0.3 + Integer.parseInt(Grade[3])*0.4);
		Grade[4] =String.valueOf(gs);
		print(Grade);

		Grade[0] = "Jasmine"; Grade[1] = "86"; Grade[2] = "92"; Grade[3] = "86";
		gs =(Integer.parseInt(Grade[1])*0.3 + Integer.parseInt(Grade[2])*0.3 + Integer.parseInt(Grade[3])*0.4);
		Grade[4] =String.valueOf(gs);
		print(Grade);

		Grade[0] = "Jericho"; Grade[1] = "83"; Grade[2] = "87"; Grade[3] = "85";
		gs =(Integer.parseInt(Grade[1])*0.3 + Integer.parseInt(Grade[2])*0.3 + Integer.parseInt(Grade[3])*0.4);
		Grade[4] =String.valueOf(gs);
		print(Grade);

		Grade[0] = "Jasper"; Grade[1] = "91"; Grade[2] = "83"; Grade[3] = "87";
		gs =(Integer.parseInt(Grade[1])*0.3 + Integer.parseInt(Grade[2])*0.3 + Integer.parseInt(Grade[3])*0.4);
		Grade[4] =String.valueOf(gs);
		print(Grade);
	}
	
	public static void print(String Grade[]) {
		for (int x = 0; x < Grade.length; x++) {
	//		System.out.println(Grade[0] + "\t\t" + Grade[1] + "\t\t" + Grade[2] + "\t\t" + Grade[3] + "\t\t" + Grade[4]);
	System.out.printf("%s\t\t%s\t\t%s\t\t%s\t\t%s\n", Grade[0], Grade[1], Grade[2], Grade[3], Grade[4]);			
			break;
		}
	}

}