package Demo;
import java.util.Scanner;

public class XileamOrPhloeam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int num = sc.nextInt();

		int last = 0;
		int temp=num;
		int rem=0;
		int sum=0;
		
		
		
		while(temp>0) {
			rem=temp%10;
			sum+=rem;
			temp=temp/10;
		}
		
		last = num%10;
		
		int inner=sum-last-rem;
		int outer= last+rem;
		
		if(inner==outer)System.out.println("xyleam");
		else
			System.out.println("phloyeam");
		
		
		
		
		
	}
	
}
