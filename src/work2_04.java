import java.util.Scanner; //Scanner is in the java.util package

public class work2_04 {
	public static void main(String[] atgs) {
		final double PI = 3.14159;//Declare a constant
		
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a radius
		System.out.print("Enter a number for radius:");
		double radius = input.nextDouble();
		
		//Compute area
		double area = radius *  radius * PI;
		
		//Display result
		System.out.println("The area for the cirlce of radius " +
		radius +" is " + area );
		
		input.close();
	}
}
