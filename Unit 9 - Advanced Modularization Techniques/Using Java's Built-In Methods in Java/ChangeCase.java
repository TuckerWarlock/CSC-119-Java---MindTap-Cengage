// ChangeCase.java - This program converts a string to lowercase and uppercase.
// Input:  Interactive
// Output:  Uppercase and lowercase versions of the user-entered string.
import java.util.Scanner;

public class ChangeCase
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		String sample;
		String result;

		System.out.println("Enter a string or done when you want to quit.");

		sample  = s.nextLine();
		 
           	while(sample.compareTo("done") != 0)
		{
			 // Call () method here and print the result.
            result = lowerCase(sample);
            System.out.println("Lowercase: " + result);
            
            // Call () method here and print the result.
            result = upperCase(sample);
            System.out.println("Uppercase: " + result);
            
			System.out.println("Uppercase: " + result);
			System.out.println("Enter a string or done when you want to quit.");
			sample  = s.nextLine();
		}						
		
		System.exit(0);

	} // End of main() method.
		public static String lowerCase (String output) {
        return output.toLowerCase();
    }
    public static String upperCase (String output) {
        return output.toUpperCase();
    }

} // End of ChangeCase class.

