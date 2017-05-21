/**
* Lab Assignment #7
    
* StarPattern1.java This is a modified version of the Stars.java program

* from Listing 6.4 in the text. 
  
* @author Patricia Wilthew
    
* Pledge: "I pledge my Honor that I have not cheated, and will not cheat, on this assignment." Patricia Wilthew.
    
*/

import java.util.Scanner;

public class StarPattern1
{
   //------------------------------------------------
   //  Prints a triangle shape using asterisk (star)     
   //  characters.
   //------------------------------------------------
   
   public static void main(String[] args)
   {
    
      Scanner scan = new Scanner(System.in);
    
      System.out.print("Rows: ");
      
      int ROWS = scan.nextInt();
   
    // Ask user for input until it is valid
      while (ROWS <= 0)
      {
         System.out.print("Rows: ");
         ROWS = scan.nextInt();
      }
   
    // Printing process
      for (int row = 1; row <= ROWS; row++) 
      {
         for (int space = 1; space <= ROWS-row ; space++)
         {
            System.out.print(" ");
         }
        
         for (int star = 1; star <= row; star++)
         {
            System.out.print("*");
         }
        
         System.out.println();
      }
    
   }    
  
}
