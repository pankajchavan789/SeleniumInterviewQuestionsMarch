package Abstraction;

public class Car extends Vehicle {
	
	public void aura() {
		System.out.println("this is syden car");
	}

	public static void main(String[] args) {
		Car c=new Car();
		c.aura();
	}

}
