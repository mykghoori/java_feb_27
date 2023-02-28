package assignments;

public class Demo8 {
	
	public int getDate() {
		int date = 10;
		return date;
	}
	
	public static void main(String[] args) {
		Demo8 demo8 = new Demo8();
		
		
		int value = demo8.getDate();
		System.out.println("It is" + value + "th of this month");
	}

}
