package Demo;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value:");
		int decimal = sc.nextInt();
		System.out.println(decimal(decimal));
		
	}
	public static int decimal(int decimal){
			int binary = 0; int place = 1;
			
			while (decimal!=0) {
				binary += (decimal%2) * place;
				place = place * 10;
				decimal /= 2;
		}
			return binary;
	}
}
