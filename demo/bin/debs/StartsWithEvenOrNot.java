package Demo;
import java.util.Scanner;

public class StartsWithEvenOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter number:");
		int num = sc.nextInt();
		if(EvenOrOdd(num)) {
			System.out.println("1st number is even");
		}
		else {
			System.out.println("1st number is odd");
		}
		
	}
	public static boolean EvenOrOdd(int num) {
		
		while(num >= 10) {
			num = num/10;
		}
		if(num % 2 == 0)
			return true;
		else 
			return false;	
	}
}
