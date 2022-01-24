/*Maria Salonga
 *Tuesday, September 14, 2021*/
import java.util.Scanner;
public class assignmentOne {
	
	//These variables hold the users input
	static double collector;
	static double beta = 1;
	
	//Start of the main method
	public static void main(String[] args) {
		
		//Importing the scanner
		Scanner input = new Scanner(System.in);	
		
		/*This while loop asks the user for input and outputs the current gain.
		This loop will run until the user enters zero for beta*/
		while (beta != 0) {
			System.out.println("Enter the amount of collector current (in Amperes): ");
			collector = input.nextDouble();
			System.out.println("Enter the amount of base current (in Amperes): ");
			beta = input.nextDouble();
			System.out.println("The transitor current gain is: " + collector/beta + ".");
		}
		//Closes the scanner
		input.close();
	}
}
