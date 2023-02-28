package demo;

public class Clock {
	public static void main(String[] args) {
		int time = 30;
		
		
		if (time < 12) {
			System.out.println("Good Morning");
		}
		else if(time < 16) {
			System.out.println("Good afternoon");
		}
		else if (time < 20) {
			System.out.println("Good evening");
		}
		else {
			System.out.println("Good night");
		}
	}
     
}
