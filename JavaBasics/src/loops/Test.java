package loops;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int PIN_IN_DB = 4321;
		// Class object = new Class();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your name: ");
		int PIN_Entered_By_User = scanner.nextInt();
		
		if(PIN_IN_DB == PIN_Entered_By_User) {
			System.out.println("PIN Correct");
			
		}
		else {
				System.out.println("PIN incorrect");
		}
	}

}
