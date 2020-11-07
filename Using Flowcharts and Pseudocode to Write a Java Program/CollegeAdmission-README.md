# Using Flowcharts and Pseudocode to Write a Java Program

### Summary
In this lab, you use the flowchart and pseudocode found in the figure below to add code to a partially created Java program. 
When completed, college admissions officers should be able to use the Java program to determine 
whether to accept or reject a student, based on his or her test score and class rank.
```
start
   input testScore, classRank
   if testScore >= 90 then
      if classRank >= 25 then
         output "Accept"
      else
         output "Reject"
      endif
   else
      if testScore >= 80 then
         if classRank >= 50 then
            output "Accept"
         else
            output "Reject"
         endif
      else
         if testScore >= 70 then
            if classRank >= 75 then
               output "Accept"
            else
               output "Reject"
            endif
         else
            output "Reject"
         endif
      endif
   endif
stop
```
> Instructions:
1. Study the pseudocode in picture above.
2. Declare the variables testScoreString and classRankString.
3. Write the interactive input statements to retrieve:
4. A student’s test score (testScoreString)
5. A student's class rank (classRankString)
6. Write the statements to convert the string representation of a student’s test score and class rank to the integer data type (testScore and classRank, respectively).
7. The rest of the program is written for you.
8. Execute the program by clicking "Run Code." Enter 87 for the test score and 60 for the class rank.
9. Execute the program by entering 60 for the test score and 87 for the class rank.
