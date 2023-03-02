package arrays;

public class Cities {
	
	public static void main(String[] args) {
		
		String[][] cities = new String[4][3];
		
		cities[2][1] = "London";
		cities[3][2] = "Paris";
		cities[0][1] = "New York";
		
		System.out.println(cities[1][2]);
		//Today is Wednesday
	}

}
