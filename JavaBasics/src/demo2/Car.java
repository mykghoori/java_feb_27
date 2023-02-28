package demo2;

public class Car {
	
	private String color;
	private String engineType;
	private int model;
	
	public Car(String colorofCar, String typeofEngine, int carModel) {
		color = colorofCar;
		engineType = typeofEngine;	
		model = carModel;
	}
	
	public void printCarInfo() {
		System.out.println("Color of Car = " + color);
		System.out.println("Type of engine = " + engineType);
		System.out.println("Model of car = " + model);
	}
	
	public static void numberOfSteeringwheels() {
		System.out.println("It has 1 steering wheel");
	}
	
	public static void main(String[] args) {
		//Create an object
		Car mercedes = new Car("silver", "petrol", 2017);
		
		Car audi = new Car("Black", "diesel", 2018);
		
		//object.method
		mercedes.printCarInfo();
		numberOfSteeringwheels();
	}

}
