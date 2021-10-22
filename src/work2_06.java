import java.util.Scanner;
public class work2_06 {
	public static void main(String[] atgs) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a degree in Fahrenhreit: ");
		double fahrenheit = input.nextDouble();
		
		//Convert Fahrenheit to Celsius
		double celsius = (5.0 / 9) *(fahrenheit - 32);
		System.out.println("Fanhrenheit " + fahrenheit + " is " + celsius + " in Celsius");
		
		input.close();
	}
}
