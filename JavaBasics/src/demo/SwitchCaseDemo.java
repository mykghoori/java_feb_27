package demo;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		String day = "MONDAY";

		switch (day.toLowerCase()) {
		case "monday":
			System.out.println("wear a white dress today");
			break;

		case "tuesday":
			System.out.println("wear a yellow dress today");
			break;

		case "wednesday":
			System.out.println("waer a red dress today");
			break;

		case "thursday":
			System.out.println("waer a pink dress today");
			break;

		case "friday":
			System.out.println("waer a brown dress today");
			break;

		case "saturday":
			System.out.println("waer a orange dress today");
			break;

		case "sunday":
			System.out.println("waer a green dress today");
			break;

		default:
			System.out.println("Please enter a valid input");
		}
	}

}
