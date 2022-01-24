/*Maria Salonga
 * Wednesday, September, 2021
 * The first two lines of input will provide the values of n and m, in that order followed, one per line, by n adjectives and m nouns. This program
outputs the similes in any order.*/
import java.io.*;
public class questionFive {

	/*This is the beginning of the main method*/
	public static void main(String[] args) throws IOException{
		/*Im calling the scanner and creating two arrays that will hold the adjectives and the nouns*/
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String[] adjectives;
		String[] nouns;
		
		/*This asks the user how much nouns and adjectives they would like to enter then makes the corresponding number of slots in arrays*/
		System.out.println("Input the number of adjectives you would like to enter: ");
		int numOfAdj = 0;
		boolean adjNotEqual = false;
		
		//This while loop checks that the input is not a letter
		while (!adjNotEqual) {
			try {
				numOfAdj = Integer.parseInt(read.readLine());
				adjNotEqual = true;
			} catch (NumberFormatException e) {
				System.out.println("Input is not a valid integer. Please try again.");
			}
		}
		adjectives = new String[numOfAdj];
		
		System.out.println("Input the number of nouns you would like to enter: ");
		
		int numOfNouns = 0;
		boolean nounNotEqual = false;
		
		//This while loop checks that the input is not a letter
		while (!nounNotEqual) {
			try {
				numOfNouns = Integer.parseInt(read.readLine());
				nounNotEqual = true;
			} catch (NumberFormatException e) {
				System.out.println("Input is not a valid integer. Please try again.");
			}
		}
		nouns = new String[numOfNouns];
		
		//These for loops fill in the arrays with adjectives and nouns of the user's choice
		for(int x = 0;x < nouns.length; x++){
			System.out.println("Enter a noun: ");
			nouns[x] = read.readLine();
		}
		
		for(int x = 0;x < adjectives.length; x++){
			System.out.println("Enter an adjective: ");
			adjectives[x] = read.readLine();
		}
		
		//These for loops prints out the different similes.
		for(int y = 0;y < numOfNouns;y++) {			
			for(int x = 0;x < numOfAdj; x++){
				System.out.println(adjectives[x] + " as " + nouns[y]);
			}
		}
	}
}
