package JavaOops;

class Vehicle{
	public void startEngine() {
		System.out.println("Engine started");
	}
	public void stopEngine() {
		System.out.println("engine stoped");
	}
}

class Car extends Vehicle{
	public void drive() {
		System.out.println("car is driving");
	}
}

public class MainApp {
	public static void main(String[] args) {
		
		Car c = new Car();
		c.startEngine();
		c.drive();
		c.stopEngine();
	}
}
