package Demo;
import java.util.*;

public class LCM {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter two numbers: ");
	        int a = sc.nextInt();
	        int b = sc.nextInt();

	        int max;

	        if (a > b) {
	            max = a;
	        } else {
	            max = b;
	        }

	        // find LCM
	        while (true) {
	            if (max % a == 0 && max % b == 0) {
	                System.out.println("LCM = " + max);
	                break;
	            }
	            max++;
	        }
	    }
}
