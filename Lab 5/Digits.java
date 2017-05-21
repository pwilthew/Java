/**

* Lab Assignment #5
    
* Digits.java Receives an integer value and prints its amount of 

* 'Zero' digits, 'Even' digits, and 'Odd' digits       
  
* @author Patricia Wilthew
    
* Pledge: "I pledge my Honor that I have not cheated, and will not cheat, on this assignment." Patricia Wilthew.
    
*/

import java.util.Scanner;

import java.lang.Math;

public class Digits
{
	// ---------------------------------------------------
	// Main reads an integer and prints how many 'zeros',
    // how many 'even', and how many 'odd' digits it has
    // ---------------------------------------------------
   public static void main (String[] args)
   {
      int integer;
    
      int currentDigit;
      
      int originalInteger;
      
      int evenOrOdd = 0;
      
      int evenCounter = 0;
      
      int oddCounter = 0;
      
      int zeroCounter = 0;
    
      Scanner scan = new Scanner(System.in);
      
      // Ask user for input
      System.out.print("Enter an integer value: ");
       
      // integer contains the integer entered by the user
      integer = scan.nextInt();
      
      // originalInteger contains a copy of the initial integer entered 
      originalInteger = integer;
      
      // Now integer will contain the integer to evaluate
      integer = Math.abs(integer);
   
      
      while (integer > 0)
      {   
         // currentDigit initially contains the last digit of the integer entered
         currentDigit = integer % 10;
         
         // evenOrOdd will contain a 0 if currentDigit is Even (or zero) or 1 if it's Odd  
         evenOrOdd = currentDigit % 2;
         
         // If currentDigit is Odd   
         if (evenOrOdd == 1)
         
         {  // Increase the value of oddCounter
            oddCounter = oddCounter + 1;
            
            // Update the integer to evaluate next
            integer = (integer - currentDigit) / 10;
         }
         // If currendDigit is Even or Zero    
         else if (evenOrOdd == 0)
         {   
            // If it is NOT zero then it is Even
            if (currentDigit != 0)
            {
               // Increase the value of evenCounter
               evenCounter = evenCounter + 1;
               
               // Update the integer to evaluate next
               integer = (integer - currentDigit) / 10;
            }
            // If it is a zero
            else if (currentDigit == 0)
            {
               // Loop in case there are consecutive zeros
               while (currentDigit == 0)
               {
                  // Increase the value of zeroCounter
                  zeroCounter = zeroCounter + 1;
                  
                  // Update the integer to evaluate next
                  integer = integer / 10;
                  
                  // Get the digit to evaluate next in currentDigit
                  currentDigit = integer % 10;
               }
            }
         }    
      }
      
      // If the original integer entered was 0, the loop never executed
      // so the zeroCounter has to be increased manually
      if (originalInteger == 0)
      {
         zeroCounter = 1;
      }
      
      // Print the results
      System.out.println("The number " + originalInteger + " consists of: ");
      
      System.out.println("Zero digits: " + zeroCounter);
      
      System.out.println("Even digits: " + evenCounter);
      
      System.out.println("Odd digits: " + oddCounter);
   }
}