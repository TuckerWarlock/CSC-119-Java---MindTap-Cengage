import java.util.Scanner;
import java.util.Arrays;
public class BattingAverage
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		final int ARRAY = 8;

        // Declare array here.
        double[] averages = new double[8];

        // Use this integer variable as your loop index.
        int loopIndex;

        // Use this variable to store the batting average input by user.
        double battingAverage;

        // String version of batting average input by user.
        String averageString;

        // Use these variables to store the minimum and maximum batting averages.
        double min, max;

        // Use these variables to store the total and the average.
        double total, average;

        System.out.println("Enter a batting average: ");
        // Write a loop to get batting averages from user and assign to array.
        for(loopIndex = 0; loopIndex < ARRAY; loopIndex++){
            

            averageString  = s.nextLine();
            battingAverage = Double.parseDouble(averageString);
            // Assign value to array.
            averages[loopIndex] = battingAverage;
        }

        // Assign the first element in the array to be the minimum and the maximum.
        min = averages[0];
        max = averages[0];
        // Start out your total with the value of the first element in the array.
        total = 0;
        // Write a loop here to access array values starting with averages[1]
        for(loopIndex = 0; loopIndex < averages.length; loopIndex++){
            // Within the loop test for minimum and maximum batting averages.

            // Also accumulate a total of all batting averages.
            total = total + averages[loopIndex];
        }
        Arrays.sort(averages);
        // Calculate the average of the 8 averages.
        average = total/averages.length;

        // Print the averages stored in the averages array.
        

        // Print the maximum batting average, minimum batting average, and total batting average.
        System.out.println("Minimum batting average is " + averages[0]);
        System.out.println("Maximum batting average is " + averages[averages.length-1]);
		System.out.println("Average batting average is " + average);

		System.exit(0);

	}
}

