# Understanding Sequential Statements

### Summary
In this lab, you complete a Java program with the provided data files. 
The program calculates the amount of tax withheld from an employee’s weekly salary, 
the tax deduction to which the employee is entitled for each dependent, and the employee’s take-home pay. 
The program output includes state tax withheld, federal tax withheld, dependent tax deductions, salary, and take-home pay.

> Instructions:
Ensure the file named Payroll.java is open.

Variables have been declared and initialized for you as needed, 
the output statements have been written and the input object has been declared and initialized for you.
Read the code carefully before you proceed to the next step.

> Write the Java code needed to perform the following:
1. Calculate state withholding tax (stateTax) at 6.5 percent
2. Calculate federal withholding tax (federalTax) at 28.0 percent.
3. Calculate dependent deductions (dependentDeduction) at 2.5 percent of the employee’s salary for each dependent.
4. Calculate total withholding (totalWithholding) as stateTax + federalTax + dependentDeduction.
5. Calculate take-home pay (takeHomePay) as salary minus total withholding.
6. Compile and execute your program by clicking the Run button. You should get the following output:
```
State Tax: $81.25  
Federal Tax: $350.00000000000006
Dependents: $62.5
Salary: $1250
Take-Home Pay: $756.25
```
In this program, the variables salary and numDependents are initialized with the values 1250.00 and 2.  
To make this program more flexible, modify it to accept interactive input for salary and numDependents.
