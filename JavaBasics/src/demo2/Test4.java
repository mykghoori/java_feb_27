package demo2;

public class Test4 {
	
// public void printSum() {
//   System.out.println("3+7 =" + (3+7));
//	}
	
	public int printSum() {
		int sum= 10;
		return sum;
	}
	public static void main(String[] args) {
		Test4 test4 = new Test4();
		//test4.printSum();
		
		int output = test4.printSum();
		
		System.out.println("3+7 =" + output);
	}

}
