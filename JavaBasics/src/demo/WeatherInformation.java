package demo;

public class WeatherInformation {

	public static void main(String[] args) {
		int temperature = -3;

		if (temperature < -15)
		{
			System.out.println("Extremly Cold");
		}
		else if (temperature < 0)
		{
			System.out.println("Cold");
		}
		else if (temperature < 15)
		{
			System.out.println("Pleasant");
		}
		else if(temperature > 15);
		{
			System.out.println("Hot");
		}
	}

}
