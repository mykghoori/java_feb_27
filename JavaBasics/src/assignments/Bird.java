package assignments;

public class Bird {
	
	String color; //global variable
	boolean canFly; //global variable
	
	public Bird(String birdColor, boolean flyStatus) {
		color = birdColor;
		canFly = flyStatus;
	}
	
	public void printBirdInfo() {
		System.out.println("Color of Bird = " + color);
		System.out.println("canFly = " + canFly);
	}
	
	public static void main(String[] args) {
		//Create an object
		Bird parrot = new Bird("green", true);
		Bird eagle = new Bird("brown", true);
		Bird ostrich = new Bird("brown", false);
		
		ostrich.printBirdInfo();
	}

}
