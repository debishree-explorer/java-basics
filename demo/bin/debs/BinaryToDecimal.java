package Demo;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value:");
		int binary = sc.nextInt();
		System.out.println(convertDecimal(binary));
	}
	private static int convertDecimal(int binary) {
		int decimal = 0 ; int pow = 1;
		
		while(binary !=0) {
			decimal +=(binary%10)*pow;
			pow = pow*2;
			binary = binary/10;
		}
		return decimal;
	}
}
