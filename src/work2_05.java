import java.util.Scanner;

public class work2_05 {
	public static void main(String[] atgs) {
		Scanner input = new Scanner(System.in);
		//Prompt the user for input
		System.out.print("Enter an integer for seconds:");
		int seconds = input.nextInt();
		
		int minutes = seconds / 60; //Find minutes in seconds
		int remainingSceconds = seconds %60; //Seconds remaining
		System.out.println(seconds + " seconds is " + minutes +" minutes and " + remainingSceconds +" seconds");
		
		input.close();
	}
}
