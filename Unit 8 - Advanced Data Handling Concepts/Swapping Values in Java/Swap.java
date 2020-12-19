// Swap.java - This program determines the minimum and maximum of three values input by 
// the user and performs necessary swaps.  
// Input:  Three int values. 
// Output:  The numbers in numerical order. 

import java.util.Scanner;

public class Swap
{
   public static void main(String args[]) throws Exception
   {
      // Declare variables.
      String firstNumber;        // String version of first number.
      String secondNumber;       // String version of second number.
      String thirdNumber;        // String version of third number.
      int first = 0;          // First number.
      int second = 0;            // Second number.
      int third = 0;          // Third number.
      int temp = 0;            // Used to swap numbers.
        Scanner input = new Scanner(System.in);


        // Get user input.
        System.out.print("Enter first number: ");
        firstNumber = input.nextLine();
        if(firstNumber != null)
        {
            System.out.print("Enter second number: ");
            secondNumber = input.nextLine();
            System.out.print("Enter third number: ");
            thirdNumber = input.nextLine();
            // Convert Strings to int.
            first = Integer.parseInt(firstNumber);
            second = Integer.parseInt(secondNumber);
            third = Integer.parseInt(thirdNumber);
        }

        // Test to see if the first number is greater than the second number.
        if(first > second){
            temp = first;
            first = third;
            third = temp;
        }
        // Test to see if the second number is greater than the third number.
        if(second > third){
            temp = second;
            second = third;
            third = temp;
        }
        // Test to see if the first number is greater than the second number again.
        if(first > second){
            temp = first;
            first = second;
            second = temp;
        }

      // Print values in numerical order. 
      System.out.println("Smallest: " + first);
      System.out.println("Next largest: " + second);
      System.out.println("Largest: " + third); 

      // Exit the program.
      System.exit(0);

   } // End of main() method.
} // End of Swap class.
