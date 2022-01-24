/*Maria Salonga
 * Friday, September 14, 2021
 * This code cycles through a sentence that the user inputs and outputs the amount of each letter that is in that sentence*/
import java.util.Scanner;
public class questionTw0 {
/*Here I am initializing variables that are used in the while loop to hold the user's input,
 * store the alphabet, and the count for each letter*/
	
static char sentence[];
static String phrase = "ha";
static int[] count = new int[26];

static String[] alphabet= {"A", "B", "C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	
public static void main(String[] args) {
		//importing the scanner
		Scanner input = new Scanner(System.in);
		
		//This while loops runs as long as the user's input is not "stop"
		while (!(phrase.equals("stop"))) {
			
			//This reads the users input then converts it to a character array
			phrase = input.nextLine();
			sentence = phrase.toCharArray();
			
			//This for loop initializes the count array with zeros
			for(int x = 0;x < count.length;x++) {
				count[x] = 0;
			}
			
			//This for loop cycles through the character array and counts how many of each letter there are
			for (int i = 0; i < phrase.length(); i++) {
					switch(sentence[i]) {
					case 'a','A':
						count[0]++;
						break;
					case 'b','B':
						count[1]++;
						break;
					case 'c','C':
						count[2]++;
						break;
					case 'd','D':
						count[3]++;
						break;
					case 'e','E':
						count[4]++;
						break;
					case 'f','F':
						count[5]++;
						break;
					case 'g','G':
						count[6]++;
						break;
					case 'h','H':
						count[7]++;
						break;
					case 'i','I':
						count[8]++;
						break;
					case 'j','J':
						count[9]++;
						break;
					case 'k','K':
						count[10]++;
						break;
					case 'l','L':
						count[11]++;
						break;
					case 'm','M':
						count[12]++;
						break;
					case 'n','N':
						count[13]++;
						break;
					case 'o','O':
						count[14]++;
						break;
					case 'p','P':
						count[15]++;
						break;
					case 'q','Q':
						count[16]++;
						break;
					case 'r','R':
						count[17]++;
						break;
					case 's','S':
						count[18]++;
						break;
					case 't','T':
						count[19]++;
						break;
					case 'u','U':
						count[20]++;
						break;	
					case 'v','V':
						count[21]++;
						break;
					case 'w','W':
						count[22]++;
						break;
					case 'x','X':
						count[23]++;
						break;
					case 'y','Y':
						count[24]++;
						break;
					case 'z','Z':
						count[25]++;
						break;
					}
				}
			
				//This loop prints out each count
				for(int i = 0; i < count.length; i++) {
					if(count[i]>0 && !(phrase.equals("stop"))) {
						System.out.print(alphabet[i] + "-" + count[i] + ":");
					}	
				}
			}
		//This closes the scanner and exits the program
		input.close();
		System.exit(0);
	}
}
