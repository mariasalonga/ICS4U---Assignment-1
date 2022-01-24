/*Maria Salonga
 * Monday, September 27, 2021
 * This program runs rock, paper, scissors. If the two players show the same item then it is a draw, and neither player wins the round. For this
particular program, the overall winner is the first player to win two rounds.
The input will contain pairs of letters separated by single spaces. Each pair of letters make up a
single round between two players. The letters are either “P”, “S”, or “R” (upper case),
representing paper, scissors and rock, respectively. The players names are “PLAYER ONE” and
“PLAYER TWO”. The first letter of the pair represents PLAYER ONE’s item and second letter of the
pair represents PLAYER TWO’s item. There will be enough pairs of letters (or more than enough),
on each line, to determine a winner of two rounds (although there may be more than that). The
length of each line will not exceed 255 characters. The program loops until a capital Q is entered at
the start of a game.
The output will contain the overall winner’s name (PLAYER ONE or PLAYER TWO) and the number
of draws that occur before the winner is determined, separated by a single space.*/
import java.io.*;
public class questionFour {

//These variables hold whether or not the players win, the amount of points they have, and the input
static String input = "";
static boolean PlayerOneWin = false;
static boolean PlayerTwoWin = false;
static boolean canEnterCase = false;
static int playerOneCount = 0;
static int playerTwoCount = 0;

	//Beginning of the main method and initializing the buffered reader
	public static void main(String[] args) throws IOException {		
		BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));	
		
		//This prints out a welcome message
		System.out.println("Welcome to Rock, Paper, Scissors! Press 'Q' to end the game.");
			
			//This while loops runs as long as the input is not a capital Q
			while(!(input.equals("Q"))) {
			
			//This reads the user's input
			input = entry.readLine();	
			
			//If the user inputs a Q then it will print out a thank you message and exit the program
			if(input.equals("Q")) {
				
				System.out.println("Thank you for playing.");
				System.exit(0);
			
			//This else statement will run if the input is not a Q
			} else {
				
				//This turns the string into a tokens
				String[] tokens = (input.split(" "));
				canEnterCase = false;
				
				//This while loop runs as long as the none of the inputs that the user puts in is valid
				while (canEnterCase == false) {
				
				//This for loop chacks through the array to see if any inputs are valid and awards points if valid.
				for (int x = 0;x < tokens.length; x++){
					
					//This if statement checks if the there has already been a valid input
					if(canEnterCase == true) {
						break;
					}
						//This switch awards points depending on the input. If nothing is valid, the program will say it is a draw.
						switch(tokens[x]) {
						
						case "SP","sP","Sp","sp","RS","Rs","rS","rs","PR","Pr","pR","pr":
							playerOneCount++;
							System.out.println("Player one has " + playerOneCount + " point(s).");
							canEnterCase = true;
							break;
							
						case "PS","Ps","pS","ps","SR","sR","Sr","sr","RP","rP","Rp","rp":
							playerTwoCount++;
							System.out.println("Player two has " + playerTwoCount + " point(s).");
							canEnterCase = true;
							break;
							
						default:
							if(x == (tokens.length - 1)) {
							System.out.println("This round was a draw.");
							canEnterCase = true;
							break;
							
							}
				
						}
						//This switch checks if any players have won
						switch(playerOneCount) {
					
						case 2:
							System.out.println("Player One has won this round.");
							playerOneCount = 0;
							playerTwoCount = 0;
							break;
						}
						
						switch(playerTwoCount) {
					
						case 2:
							System.out.println("Player Two has won this round.");
							playerTwoCount = 0;
							playerOneCount = 0;
							break;
						}
					
					}

				}
			
			}
			
		}

	}
	
}
