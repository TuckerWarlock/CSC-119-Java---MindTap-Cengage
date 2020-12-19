// HouseholdSize.java - This program uses a bubble sort to arrange up to 300 household sizes in
// descending order and then prints the mean and median household size. 
// Input:  Interactive.
// Output:  Mean and median household size. 

import java.util.Scanner;

public class HouseholdSize
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		// Declare variables.
		
		final int SIZE = 300;			// Maximum number of household sizes.
		int householdSizes[] = new int[SIZE];   // Array used to store up to 300 household sizes.
		int x;
		int limit = SIZE;
		int householdSize = 0; 
		String householdSizeString;
		int pairsToCompare;
		boolean switchOccurred;
		int temp = 0;
		double sum = 0; 
		double mean = 0;
		double median = 0;

		// Input household size
		System.out.println("Enter household size or 999 to quit: ");
		householdSizeString  = s.nextLine();
		householdSize = Integer.parseInt(householdSizeString);
		// This is the work done in the fillArray() method
		x = 0;
		while(x < limit && householdSize != 999)   
		{
            temp++;
			// Place value in array.
			householdSizes[x] = householdSize;
			
			x++;    // Get ready for next input item.
			System.out.println("Enter household size or 999 to quit: ");
			householdSizeString  = s.nextLine();
			householdSize = Integer.parseInt(householdSizeString); 
		}  // End of input loop.
		
		
		// Find the mean
        for(int i=0; i<temp ;i++){
            sum = sum + householdSizes[i];
        }
        mean = sum/(double)temp;
        // This is the work done in the sortArray() method
        sortArray(householdSizes, temp);
        // This is the work done in the displayArray() method
        displayArray(householdSizes, temp);
        // Print the mean
        System.out.println("Mean household size in Marengo is: " + mean);

        // Calculate the median
        System.out.println("Median household size in Marengo is: "+getMedian(householdSizes, temp));
        // Print the median
        System.out.println("Median household size: " + median);

        System.exit(0);
    } // End of main() method.

    public static int getMedian(int[] householdSizes, int size) {
        if(size % 2==0){
            return householdSizes[size/2 -1 ];
        }
        else {
            return householdSizes[size/2 ];

        }
    }
    public static void displayArray(int[] householdSizes,int size) {
        for(int i=0; i<size ;i++){
            System.out.print(householdSizes[i]+ " ");
        }
        System.out.println();
    }
    public static void sortArray(int[] householdSizes, int size) {



        int n = size;
        int temp = 0;

        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){

                if(householdSizes[j-1] > householdSizes[j]){
//swap the elements!
                    temp = householdSizes[j-1];
                    householdSizes[j-1] = householdSizes[j];
                    householdSizes[j] = temp;
                }

            }
        }

    }
} // End of HouseholdSize class.

