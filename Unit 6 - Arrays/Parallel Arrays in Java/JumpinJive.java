// JumpinJive.java - This program looks up and prints the names and prices of coffee orders.  
// Input:  Interactive.
// Output:  Name and price of coffee orders or error message if add-in is not found. 

import java.util.Scanner;

public class JumpinJive
{
   public static void main(String args[]) throws Exception
   {
      // Declare variables.
      String addIn;        // Add-in ordered by customer.
      final int NUM_ITEMS = 5; // Named constant
      // Initialized array of add-ins.
      String addIns[] = {"Cream", "Cinnamon", "Chocolate", "Amaretto", "Whiskey"}; 
      // Initialized array of add-in prices.
      double addInPrices[] = {.89, .25, .59, 1.50, 1.75};
      boolean foundIt; 
      int x = -1;           // Loop control variable.
        double orderTotal = 2.00; // All orders start with a 2.00 charge

        // Get user input.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter coffee add-in or XXX to quit: ");
        addIn = input.nextLine();

        // Write the rest of the program here.
        while(!addIn.equals("XXX")) {
            for (int i = 0; i < NUM_ITEMS; i++) {
                //String arrayValue = addIns[i];
                if (addIns[i].equals(addIn)) {
                    x = i;
                    }
                }
                // Test to see if addIn was found
            if(x < 0) {
                System.out.println("Sorry, we do not carry that.");
            } else if (addIns[x].equals(addIn)) {
                    System.out.println("addIn found");
                    System.out.println(addIns[x] + " " + addInPrices[x]);
                }

                System.out.print("Enter coffee add-in or XXX to quit: ");
                addIn = input.nextLine();

        }
        if(x < 0){
            System.exit(0);
        }
        System.out.println(orderTotal + addInPrices[x]);
   } // End of main() method.
} // End of JumpinJive class.
