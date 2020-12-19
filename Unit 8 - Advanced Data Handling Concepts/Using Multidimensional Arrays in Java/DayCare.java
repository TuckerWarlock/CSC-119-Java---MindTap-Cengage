import java.util.Scanner;

public class DayCare
{
   public static void main(String args[]) 
   {
      // Declare two-dimensional array here.
        double[][] rate = {

                { 30.00, 60.00, 88.00, 115.00, 140.00 },

                { 26.00, 52.00, 70.00, 96.00, 120.00 },

                { 24.00, 46.00, 67.00, 89.00, 110.00 },

                { 22.00, 40.00, 60.00, 75.00, 88.00 },

                { 20.00, 35.00, 50.00, 66.00, 84.00 } };
        // Declare other variables.
        int numDays;
        int age;
        String numDaysString;
        String ageString;
        int QUIT = 99;
        Scanner input = new Scanner(System.in);

        // This is the work done in the getReady() method
        // Perform a priming read to get the age of the child.
        System.out.println("Enter the age of the child: ");
        ageString = input.nextLine();
        age = Integer.parseInt(ageString);

        while(age != QUIT)
        {
            // This is the work done in the determineRateCharge() method
            // Ask the user to enter the number of days
            if(age > 4) 
                age = 4;
            // Print the weekly rate
            System.out.println( "Enter number of days: ");
            numDaysString = input.nextLine();
            numDays = Integer.parseInt(numDaysString);
            System.out.println("Weekly Rate is $" + rate[age][numDays-1]);
            // Ask the user to enter the next child's age
            System.out.println("Enter age of child or 99 to quit: ");
            ageString = input.nextLine();
            age = Integer.parseInt(ageString);

        }
        // This is the work done in the finish() method
      System.out.println("End of program");

      System.exit(0);
   } // End of main() method.
} // End of DayCare class.
