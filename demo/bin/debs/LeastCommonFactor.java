package Demo;
import java.util.Scanner;

// important for interview
public class LeastCommonFactor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a:");
		int a = sc.nextInt();
		System.out.println("enter b:");
		int b = sc.nextInt();
		
		int lcm = (a*b)/findhcf(a , b);
		System.out.println(lcm);
	}
	private static int findhcf(int a , int b) {
		while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
	}
}
