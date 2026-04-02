package debs;
import java.util.*;

public class Student {
	String name;
	int id;
	int age;
	
	void display() {
		System.out.println(name+" "+age+" "+id);
	}
	
	public static void main(String[] args) {

	Scanner sc = new Scanner (System.in);
	Student[] s1 = new Student[3];
	
	for(int i=0 ; i<s1.length ; i++) {
		s1[i] = new Student();

	System.out.println("enter student name:");
	s1[i].name = sc.nextLine();
	System.out.println("enter student id:");
	s1[i].id = sc.nextInt();
	System.out.println("enter student age:");
	s1[i].age = sc.nextInt();
	
	sc.nextLine();
	
	s1[i].display();
	}
	}
}
