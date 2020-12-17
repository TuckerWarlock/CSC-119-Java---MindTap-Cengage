// This program calculates an employee's take home pay. 
import java.util.Scanner;

public class Payroll
{
	public static void main(String args[])
	{
        Scanner s = new Scanner(System.in);
		
		double stateTax;
		double federalTax;
		
		double dependentDeduction;
		double totalWithholding;
		double takeHomePay;

        System.out.println("Enter salary: ");
        double salary = s.nextDouble();
        System.out.println("Enter dependents: ");
        double numDependents = s.nextDouble();

		// Calculate state tax here.
        stateTax = salary * .065;
		System.out.println("State Tax: $" + stateTax);
		// Calculate federal tax here. 
        federalTax = salary * .28;
		System.out.println("Federal Tax: $" + federalTax);
		// Calculate dependant deduction here.
        dependentDeduction = (salary * .025) * numDependents;
		System.out.println("Dependents: $" + dependentDeduction);
		// Calculate total withholding here.
        totalWithholding = stateTax + federalTax + dependentDeduction;
		// Calculate take home pay here.
        takeHomePay = salary - totalWithholding;
		System.out.println("Salary: $" + salary);
		System.out.println("Take-Home Pay: $" + takeHomePay);
		System.exit(0);
	}
}
