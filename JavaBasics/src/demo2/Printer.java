package demo2;

public class Printer {

	public String printName() {
		String name = "Tom";
		return name;
	}

	public static void main(String[] args) {
		Printer printer = new Printer();

		String output = printer.printName();
		System.out.println("My name is" + output);
	}

}
