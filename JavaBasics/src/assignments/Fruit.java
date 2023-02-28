package assignments;

public class Fruit {
	
	String color;
	String taste;
	
	public Fruit(String fruitColor, String fruitTaste) {
		color = fruitColor;
		taste = fruitTaste;
	}
	
	public void printFruitInfo() {
		System.out.println("Color of Fruit = " + color);
		System.out.println(" Taste of Fruit = " + taste);
	}
	
	public static void main(String[] args) {
		Fruit mango = new Fruit("yellow", "sweet");
		Fruit orange = new Fruit("orange", "tangy");
		
		orange.printFruitInfo();
	}

}
