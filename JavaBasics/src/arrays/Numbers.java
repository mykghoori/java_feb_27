package arrays;

public class Numbers {
	
	public static void main(String[] args) {
		
		//Declaration of arrays
		int[] numbers = new int[5];
		
		//Storing values in the arrays
		for(int i=0; i<5; i++) {
			numbers[i] = 20+i;
		}
		
		//Retrieve the values from the arrays
		for(int i=0; i<5; i++) {
			System.out.println(numbers[i]);
		}
//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);
//		System.out.println(numbers[2]);
//		System.out.println(numbers[3]);
//		System.out.println(numbers[4]);
	}

}
