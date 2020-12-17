// LetterE.java - This program prints the letter E with 3 asterisks
// across and 5 asterisks down. 
// Input:  None.
// Output: Prints the letter E. 

public class LetterE
{
   public static void main(String args[])
   {
      
               
      final int NUM_ACROSS = 3;  // Number of asterisks to print across.
      final int NUM_DOWN = 5;    // Number of asterisks to print down.
      int row; // Loop control for row number.
      int column; // Loop control for column number.

      // This is the work done in the detailLoop() method
      // Write a loop to control the number of rows.
      for(row = 0; row < NUM_DOWN; row++){
            for(column = 0; column < NUM_ACROSS; column++){
                // prints two column lines
                if(row == 0 || row == 2 || row == 4 ||
                        (column == 0 && row == 1) ||
                        (column == 0 && row == 3))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
                // Write a loop to control the number of columns
              // Decide when to print an asterisk in every column.
         System.out.print(" ");
         // Decide when to print asterisk in column 1.
         System.out.print(" ");
         // Decide when to print a space instead of an asterisk.
         System.out.print(" "); 
      // Figure out where to place this statement that prints a newline.
      System.out.println();

                // This is the work done in the endOfJob() method
      System.exit(0); 
   } // End of main() method.

} // End of LetterE class.
