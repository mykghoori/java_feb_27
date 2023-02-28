package assignments;

public class Demo6 {
	
	public String getName() {
		String name = "James Bond";
		return name;
	}
	public static void main(String[] args) {
		Demo6 demo6 = new Demo6();
		
		String value = demo6.getName();
		System.out.println("My name is" + value);
	}

}
