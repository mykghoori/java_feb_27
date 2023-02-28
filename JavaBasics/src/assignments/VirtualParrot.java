package assignments;

import java.util.Scanner;

public class VirtualParrot {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your massage: ");
		String massage = scanner.nextLine();
		
		while(!massage.equals("quit")) {
			System.out.println("You typed - " + massage );
			
			System.out.println("Please enter your massage: ");
			massage = scanner.nextLine();
		}
	}

}
