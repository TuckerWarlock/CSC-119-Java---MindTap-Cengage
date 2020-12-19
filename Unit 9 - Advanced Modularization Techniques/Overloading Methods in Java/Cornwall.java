// Cornwall.java - This program computes hotel guest rates.
// Input:  Days in stay and meals included
// Output:  Hotel guest rate
import java.util.Scanner;

public class Cornwall
{
	public static void main(String args[]) 
	{
        Scanner input = new Scanner(System.in);
        int days;
        String dayString;
        String mealPlan = "";
        String question;
        double rate = 0.00;

        System.out.println("How many days do you plan to stay? ");

        dayString  = input.nextLine();
        days = Integer.parseInt(dayString);
        System.out.println(" Do you want a meal plan? Y or N: ");
        question  = input.nextLine();
        // Figure out which arguments to pass to the computeRate() method and
        // then call the computeRate() method
        if (question.equals("Y")){
            System.out.println("Enter A for 3 meal per day plan, or C for just Breakfast: ");
            mealPlan = input.nextLine();
            rate = computeRate(days, mealPlan);
        }
        else{
            rate = computeRate(days, mealPlan);
        }

        System.out.println("The rate for your stay is: " + rate);
        System.exit(0);

    } // End of main() method.


    // Write computeRate methods here.
    public static double computeRate(double days, String mealPlan){
        if (mealPlan.equals("A")){
            return 169.00 * days;
        }
        else if (mealPlan.equals("C")){
            return 112.00 * days;
        }
        else{
            return days * 99.99;
        }
    }
	
} // End of Cornwall class.

