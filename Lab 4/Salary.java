/**

* Lab Assignment #4

* Salary.java Computes the amount of a raise and the new salary for an employee. The current
  
* salary and a performance rating (a String: "Excellent","Good" or "Poor") are input.

* @author Patricia Wilthew

* Pledge: "I pledge my Honor that I have not cheated, and will not cheat, on this assignment." Patricia Wilthew

*/
 
import java.util.Scanner;

import java.text.NumberFormat;


public class Salary {

 // ---------------------------------------------------------
 // Main reads in an employee's salary and performance rating
 // to calculate the raise percentage he or she will have
 // ---------------------------------------------------------

   public static void main (String[] args) {
   
      double currentSalary; // employee's current salary
   
      double raise = 0.0; // amount of the raise
   
      double newSalary; // new salary for the employee
   
      String rating; // performance rating
   
      final double POOR = 0.015; // poor performance -> 1.5% raise
       
      final double GOOD = 0.04; // good performance -> 4% raise
       
      final double EXCELLENT = 0.06; // excellent performance -> 6% raise
    
      Scanner scan = new Scanner(System.in);
   
   
   	// Ask user for input
   	
      System.out.print ("Enter the current salary: ");
   
      currentSalary = scan.nextDouble();
   
      System.out.print ("Enter the performance rating (Excellent, Good, or Poor): ");
   
      rating = scan.next();
   
   
   	// Compute the raise using if
   
      if (rating.equals("Poor")) {
       
         raise = currentSalary * POOR;
      }     
      if (rating.equals("Good")) {
            
         raise = currentSalary * GOOD;
      }
      if (rating.equals("Excellent")) {
       
         raise = currentSalary * EXCELLENT;
      }
      
      
      newSalary = currentSalary + raise;
   
   
   	// Print the results
   
      NumberFormat money = NumberFormat.getCurrencyInstance();
   
      System.out.println("Current Salary:       " + money.format(currentSalary));
   
      System.out.println("Amount of your raise: " + money.format(raise));
   
      System.out.println("Your new salary:     " + money.format(newSalary));
   
      System.out.println();
   
   }

}