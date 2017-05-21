 /**
* Lab Assignment #7

* Multable.java 
    
* This program asks the user for the number of columns.
   
* It then generates a multiplication table showing 

* multiple of 1 thru 12 up to the column value.
     
* @author Patricia Wilthew
    
* Pledge: "I pledge my Honor that I have not cheated, and will not cheat, on this assignment." Patricia Wilthew.
    
*/

import java.util.Scanner;

public class Multable
{
   public static void main(String [] args)
   {
      final int ROWS = 12;  // number of rows is fixed
      int cols;             // number of columns is not
    
      Scanner scan = new Scanner (System.in);
    
      // Ask the user for the number of columns
      System.out.print("Enter numbers of columns: ");
      cols = scan.nextInt();
   
      // Validate the input
      while (cols < 0)
      {
         System.out.print("Try again: ");
         cols = scan.nextInt();
      }
    
      // Declare 2-D array
      int [][] table = new int[ROWS][cols];
    
      // Fill the array with mutiples
      for (int i = 1; i <= ROWS; i++)
      {
         for (int j = 1; j <= cols; j++)
         {
            table[i-1][j-1] = i*j;
         }
      }
      
      System.out.println("Here's your table: \n");
    
      // Print the array
      for (int i = 0; i < ROWS; i++)
      {
         for (int j = 0; j < cols; j++)
         {
            System.out.printf("%5d", table[i][j]);
         }
         
         System.out.println();
      }   
   }
}