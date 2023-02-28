package loops;

import java.util.Scanner;

public class WhileLoopDemo {
	
	public static void main(String[] args) {
		int PIN_IN_DB = 4321;
		//Class object = new class();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your ATM PIN: ");
		int PIN_Entered_By_User = scanner.nextInt();
		
		while(PIN_Entered_By_User != PIN_IN_DB) { //while value in PIN_Entered_By_User is not equal to PIN_IN_DB
			System.out.println("The PIN entered is incorrect. Try again! ");
			PIN_Entered_By_User = scanner.nextInt();
		}
		
		System.out.println("Welcome to ABC Bank!");
		
	}

}
