package JavaOops;
import java.util.Scanner;

class FoodItem{
	double price;
	public double getPrice() {
		return price;
	}
	public double getDiscountedPrice() {
		if(price > 500) {
			return price - (price * 10 / 100);
		}
		return price;
	}
}

class Pizza extends FoodItem{
	double toppingsCost;
	public double calculateTotalPrice() {
		return getDiscountedPrice() + toppingsCost;
	}
}

public class FoodApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pizza p = new Pizza();
		
		System.out.println("enter the price of the pizza:");
		p.price = sc.nextDouble();
		System.out.println("enter the price of the toppings:");
		p.toppingsCost = sc.nextDouble();
		
		double totalPrice = p.calculateTotalPrice();
		System.out.println("Total Price:" + totalPrice);
		
		sc.close();
	}
}
