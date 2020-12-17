// SumAndProduct.java - This program computes sums and products. 
// Input:  Interactive.
// Output:  Computed sum and product. 

import java.util.Scanner;

public class SumAndProduct
{
   public static void main(String args[]) 
   {
      Scanner s = new Scanner(System.in);
      int number;              	
      String numberString;	
						
      System.out.println("Enter a positive integer or 0 to quit: ");	
						
      numberString  = s.nextLine();
      number = Integer.parseInt(numberString); 
		System.out.println(sums(number));
        System.out.println(products(number));
      while(number != 0)
      {
            // call sums() method here
            sums(number);
            

            // call products() method here
            products(number);
            
      System.out.println("Enter a positive integer or 0 to quit: ");
   	 
      numberString  = s.nextLine();
      number = Integer.parseInt(numberString); 
      }
	
      System.exit(0);

   } // End of main() method.
	
	
// Write sums() method here.
    public static int sums(int number){
        //System.out.println("Sum of digits = " + number);
        if(number <= 1){
            return 1;
        }
        else {
            return number + sums(number - 1);
        }
    }

    // Write products() method here.
    public static int products(int number){
        //System.out.println("Product of digits = " + number);
        if(number <= 1){
            return 1;
        }else {
            return number * products(number - 1);
        }
    }

} // End of SumAndProduct class.
