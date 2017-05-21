/**

* Lab Assignment #4
    
* Distance.java Computes the distance between two points
    
* @author Patricia Wilthew
    
* Pledge: "I pledge my Honor that I have not cheated, and will not cheat, on this assignment." Patricia Wilthew.
    
*/

import java.util.Scanner;

import java.text.DecimalFormat;

import java.lang.Math;

public class Distance
{
 // -----------------------------------------------------
 // Main reads in two points in the cartersian coordenate 
 // system and computes the total distance between them
 // -----------------------------------------------------
 
   public static void main (String[] args)
   {
      double xOne; // Coordinate X of point One
   	
      double yOne; // Coordinate Y of point One
   	
      double xTwo; // Coordinate X of point Two
   	
      double yTwo; // Coordinate Y of point Two
   	
      double diffInX; // Difference in the X coords
   	
      double diffInY; // Difference in the Y coords
   	
      double distance; // Total distance between points
   	
      Scanner scan = new Scanner(System.in);
      
      
   	// Set the format
        
      DecimalFormat fmt = new DecimalFormat("0.###");
      
     
   	// Read user input
             
      System.out.println ("\n*** Distance Calculator ***");
       
      System.out.print ("Enter the X coordinate of the first point: ");
     
      xOne = scan.nextDouble();
   
      System.out.print ("Enter the Y coordinate of the first point: ");
     
      yOne = scan.nextDouble();
   	
      System.out.print ("Enter the X coordinate of the second point: ");
     
      xTwo = scan.nextDouble();
   	
      System.out.print ("Enter the Y coordinate of the second point: ");
     
      yTwo = scan.nextDouble();
      
      
   	// Compute distance
   
      diffInX = xOne - xTwo;
   	
      diffInY = yOne - yTwo;
   	
      distance = Math.sqrt(Math.pow(diffInX, 2.0) + Math.pow(diffInY, 2.0));
   
   
   	// Print the label
   
      System.out.println ("\n*** Result ***");
   	
      System.out.print ("The distance between (" + fmt.format(xOne) + ", " + fmt.format(yOne) + ") and ");
      
      System.out.print ("(" + fmt.format(xTwo) + ", " + fmt.format(yTwo) + ") is " + fmt.format(distance) + "\n");
   }
}
