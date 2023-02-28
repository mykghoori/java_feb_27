package assignments;

public class Mobile {
	
	int batteryBackup;
	String color;
	double screenSize;
	
	public Mobile(int batteryTime, String mobileColor, double mobileScreenSize) {
		batteryBackup = batteryTime;
		color = mobileColor;
		screenSize = mobileScreenSize;
	}

	public void printMobileInfo() {
		System.out.println("Battery back up time = " + batteryBackup);
		System.out.println("Color of mobile = " + color);
		System.out.println(" Screen Size = " + screenSize);
	}
	
	public static void screeType() {
		System.out.println("It has a touch screenSize");
	}
	
	public static void main(String[] args) {
		Mobile apple = new Mobile(15, "white", 6);
		
		Mobile samsung = new Mobile(17, "black", 6.5);
		
		samsung.printMobileInfo();
		screeType();
	}
}
