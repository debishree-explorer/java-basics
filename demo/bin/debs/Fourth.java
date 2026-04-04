package Demo;
import java. util.Scanner;

public class Fourth {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1:");
		int a = sc.nextInt();
		System.out.println("enter num1:");
		int b = sc.nextInt();
		
		System.out.println("enter choice:");
		int choice = sc.nextInt();
		calculator(choice, a, b);
	}
		
		public static void calculator(int choice,int a,int b) {
			
		
		switch(choice) {
		case 1:System.out.println(a+b);
		break;
		case 2:System.out.println(a-b);
		break;
		case 3:System.out.println(a*b);
		break;
		case 4:System.out.println(a/b);
		break;
		}
		
	}
}

