/**

* Lab Assignment #2

* Paint.java Determines how much paint is needed to paint the walls of a room

*  given its length, width, and height.

* @author Patricia Wilthew

* Pledge: “I pledge my Honor that I have not cheated, and will not cheat, on this assignment.” Patricia Wilthew.

*/

import java.util.Scanner;

public class Paint {

   public static void main(String[] args) {
    
       // Declaration of constants and variables 
   
      final int COVERAGE = 350; // Paint covers 350 sq ft/gal
       
      final int DOOR_SIZE = 20;
       
      final int WINDOW_SIZE = 15;
   
      int length, width, height, doors, windows;
       
      double totalSqFt, paintNeeded;
   
      Scanner scan = new Scanner(System.in);
   
       // Asks and reads in the length of the room
      System.out.println("Enter the length of the room in Ft (enter an integer value):");
      length = scan.nextInt();
   
       // Asks and reads in the width of the room
      System.out.println("Enter the width of the room in Ft (enter an integer value):");
      width = scan.nextInt();
   
       // Asks and reads in the height of the room
      System.out.println("Enter the height of the room in Ft (enter an integer value):");
      height = scan.nextInt();
   
       // Asks and reads in the number of doors of the room
      System.out.println("Enter the number of doors of the room (enter an integer value):");
      doors = scan.nextInt();
       
       // Asks and reads in the number of windows of the room
      System.out.println("Enter the number of windows of the room (enter an integer value):");
      windows = scan.nextInt();
       
       // Computes the total square feet to be painted
      totalSqFt = 2*height*(width + length)-(doors*DOOR_SIZE + windows*WINDOW_SIZE); 
       
      if (totalSqFt > 0) {   
           
           // Computes the amount of paint needed in gallons
         paintNeeded = (totalSqFt/COVERAGE);
           
           // Prints results
         System.out.println("RESULTS:");
         System.out.println("Length in Ft: " + length);
         System.out.println("Width in Ft: " + width);
         System.out.println("Height in Ft: " + height);
         System.out.println("Gallons of Paint Needed: " + paintNeeded);
      }
      else {
       
           // Prints an error message
         System.out.println("Error: the total area to be painted does not exist; it is either zero or negative.");
      }
   
   }

}