// Reverse.java - This program reverses numbers stored in an array.
// Input:  Interactive.
// Output:  Original contents of array and the reversed contents of the array. 

import java.util.Scanner;
import java.util.Arrays;

public class Reverse
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int[] numbers = {9, 8, 7, 6, 5};
        int x = numbers.length;

        // Print contents of array
        System.out.println(Arrays.toString(numbers));

        // Call reverseArray method here
        reverse(numbers, x);


        // Print contents of reversed array
        //System.out.println(Arrays.toString());
        System.out.println(Arrays.toString(reverse(numbers, x)));

        System.exit(0);



    } // End of main() method.


    // Write reverseArray method here.
    public static int[] reverse(int[] a, int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        return b;
    }//end of reverseArray method
	

} // End of Reverse class.

