package Demo;

import java.util.Scanner;

public class Third {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enyter choice:");
		int choice = sc.nextInt();
		weekDays(choice);
	}
	public static void weekDays(int choice) {
		
		switch(choice) {
		case 1:System.out.println("sunday");
			break;
		case 2:System.out.println("monday");
			break;
		case 3:System.out.println("tuesday");
			break;
		case 4:System.out.println("wednesday");
		    break;
		case 5: System.out.println("thursday");
		    break;
		case 6: System.out.println("thursday");
	        break;
		case 7: System.out.println("thursday");
	        break;
		}
	}
}

