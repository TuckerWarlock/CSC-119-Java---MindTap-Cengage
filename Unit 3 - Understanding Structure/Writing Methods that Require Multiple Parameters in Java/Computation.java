// Computation.java - This program calculates sum, difference, and product of two values.
// Input:  Interactive.
// Output:  Sum, difference, and product of two values.

import java.util.Scanner;

public class Computation
{
    public static void main(String args[])
    {
        double value1;
        String value1String;
        double value2;
        String value2String;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first numeric value: ");
        value1String = input.nextLine();
        value1 = Double.parseDouble(value1String);
        System.out.println("Enter second numeric value: ");
        value2String = input.nextLine();
        value2 = Double.parseDouble(value2String);

        Computation computation = new Computation();

        // Call calculateSum() here
        computation.calculateSum(value1, value2);
        // Call calculateDifference() here
        computation.calculateDifference(value1, value2);
        // Call calculateProduct() here
        computation.calculateProduct(value1, value2);
        System.exit(0);

    } // End of main() method.


    // Write calculateSum() method here.
    public void calculateSum(double value1, double value2){
        double sum = value1 + value2;
        System.out.println("Sum: " + sum);
    }

    // Write calculateDifference() method here.
    public void calculateDifference(double value1, double value2){
        double difference = value1 - value2;
        System.out.println("Difference: " + difference);
    }

    // Write calculateProduct() method here.
    public void calculateProduct(double value1, double value2){
        double product = value1 * value2;
        System.out.println("Product: " + product);
    }

} // End of Computation class.
