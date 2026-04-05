package Demo;
import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number of elements u want to insert:");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("enter the elements:");
		for(int i=0 ; i<n ; i++) {
			arr[i]=sc.nextInt();
		}
		boolean res = has77(arr);
		System.out.println("the result according to ur input :"+res);
		
	}
	public static boolean has77(int[] arr) {
		for(int i=0 ; i<arr.length-1 ; i++) {
			if(arr[i]==7 && arr[i+1]==7)
				return true;
			if(i+2 < arr.length && arr[i]==7 && arr[i+2]==7)
				return true;
		}
		return false;
	}
}
