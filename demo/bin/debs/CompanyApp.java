package JavaOops;

class Employee{
	double salary;
	public double calculateAnnualSalary() {
		double annualSalary = salary*12;
		return annualSalary;
	}
}

class Developer extends Employee{
	  double bonus;
	  public double calculateTotalSalary() {
		  return calculateAnnualSalary()+bonus;
	  }
}
 
public class CompanyApp {
	public static void main(String[] args) {
		Developer d = new Developer();
		d.salary = 5000;
		d.bonus = 1000;
		System.out.println("Annaul Salary:"+d.calculateAnnualSalary());
		System.out.println("totat salary:"+d.calculateTotalSalary());
	}
}
