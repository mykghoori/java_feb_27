package assignments;

public class Vegetable {
	
	String color; //global variable
	String shape;
	
//	public Vegetable(String colorofVegetable, String shapeofVegetable) { //parameters of the constructor
//		color = colorofVegetable;
//		shape = shapeofVegetable;
//	}
	public Vegetable(String color, String shape) { //parameters of the constructor
		this.color = color;
		this.color = shape;
	}
	
	public void printVegetableInfo() {
		System.out.println("Color of Vegetable = " + color);
		System.out.println("Shape of Vegetable = " + shape);
	}
	
	public static void main(String[] args) {
		//Create an object
		Vegetable onion = new Vegetable("pink", "round");
		
		Vegetable potato = new Vegetable("brown", "elliptical");
		
		//object.method
		onion.printVegetableInfo();
	}

}
