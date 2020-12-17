// MovieGuide.java - This program allows each theater patron to enter a value from 0 to 4 
// indicating the number of stars that the patron awards to the Guide's featured movie of the 
// week. The program executes continuously until the theater manager enters a negative number to 
// quit. At the end of the program, the average star rating for the movie is displayed.  

import java.util.Scanner;

public class MovieGuide 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		// Declare and initialize variables.
		double numStars;         // star rating.
		String numStarsString; 	 // string version of star rating
		double averageStars;  	 // average star rating.
		double totalStars = 0; 	 // total of star ratings.
		int numPatrons = 0;      // keep track of number of patrons
			
	
		// This is the work done in the housekeeping() method
        // Get input.
        System.out.println("Enter number of stars: ");
        numStarsString = s.nextLine();

        // This is the work done in the detailLoop() method
        // Convert to double.
        numStars = Double.parseDouble(numStarsString);

        // Write while loop here
        while(numStars >= 0){
            System.out.println("Num Stars: " + numStars);
            totalStars = numStars + totalStars;
            System.out.println("Total Stars: " + totalStars);
            numPatrons++;
            System.out.println("Patrons: " + numPatrons);
            System.out.println("Enter number of stars: ");
            numStarsString = s.nextLine();
            numStars = Double.parseDouble(numStarsString);
        }
        // This is the work done in the endOfJob() method
        // Calculate average star rating
        averageStars = totalStars / numPatrons;
		
		System.out.println("Average Star Value: " + averageStars); 
		
		System.exit(0);
	} // End of main() method.

} // End of MovieGuide class.

