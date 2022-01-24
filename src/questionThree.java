/*Maria Salonga
 * Friday, September 17, 2021
 * This program calculates the shooting percentages of the players*/
import java.io.*;
import java.text.DecimalFormat;

public class questionThree {
	//Beginning of the main method
	public static void main(String[] args) throws IOException {	
		
		//This intializes a variable for he decimal format and the buffered reader
		DecimalFormat df = new DecimalFormat("0.00");
		BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));	
		
		//This prints out instructions for the use
		System.out.println("Input the the four players' names followed by the number of shots taken and the number of shots made:");
		
		//These variables hold the averages, names, and information on the players
		double average[] = new double[4];
		String[] names = new String[4];
		double numberOne = 0;
		double numberTwo = 0;
		
		//This for loop tokenizes the string input and organizes them into different arrays.
		for(int x = 0;x < 4;x++) {
			String input = entry.readLine();		
			String[] tokens = (input.split(" "));
				names[x] = tokens[0];
				numberOne = Double.parseDouble(tokens[1]);
				numberTwo = Double.parseDouble(tokens[2]);
				
				//This calculates the average then saves prints out the average with decimal formatiing
				average[x] = numberTwo/numberOne;
				System.out.println(tokens[0] + " - " + df.format(average[x]));
		}
		
		//This loop checks which player has the highest average and prints out the best player.
		double max = 0;
		String maxx = "hi";
		for(int i = 0; i < average.length; i++)
		{
			if(max < average[i])
			{
				max = average[i];
				maxx = names[i];
			}
			
			if(i == 3){
				System.out.println("The best player is " + maxx + ".");
			}
		}
	}
}  

