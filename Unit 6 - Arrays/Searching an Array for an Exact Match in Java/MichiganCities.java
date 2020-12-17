// MichiganCities.java - This program prints a message for invalid cities in Michigan.  
// Input:  Interactive.
// Output:  Error message or nothing.


import java.util.Scanner;

public class MichiganCities
{
   public static void main(String args[]) throws Exception
   {
      // Declare variables.
      String inCity;               // name of city to look up in array.
      // Initialized array of cities in Michigan.
      String citiesInMichigan[] = {"Acme", "Albion", "Detroit", "Watervliet", "Coloma", "Saginaw", "Richland", "Glenn", "Midland", "Brooklyn"}; 
      boolean foundIt = false;  // Flag variable.
      int x = 0;           // Loop control variable.

        // Get user input.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the city: ");
        inCity = input.nextLine();

        // Write your loop here.
        for(int i = 0; i < citiesInMichigan.length; i++){
            String arrayValue = citiesInMichigan[i];
            if (inCity.equals(arrayValue)) {
                x = 1;
            }
        }
        // Write your test statement here to see if there is
        // a match.  Set the flag to true if city is found.
        if(x == 1){
            foundIt = true;
            System.out.println("City found");
        }



        // Test to see if city was not found to determine if
        // "Not a city in Michigan" message should be printed.
        if(x == 0){
            System.out.println("Not a city in Michigan.");
        }
      System.exit(0);

      

   } // End of main() method.
} // End of MichiganCities class.
