/**

* Lab Assignment #4
    
* DeliFormat.java Computes the price of a deli item given the weight
    
* (in ounces) and price per pound, prints a price label for the item.
    
* @author Patricia Wilthew
    
* Pledge: "I pledge my Honor that I have not cheated, and will not cheat, on this assignment." Patricia Wilthew.
    
*/

import java.util.Scanner;

import java.text.DecimalFormat;

import java.text.NumberFormat;


public class DeliFormat
{
	// ---------------------------------------------------------
	// Main reads in the price per pound and number of ounces
	// of a deli item and then computes the total price to print
	// a label
	// ---------------------------------------------------------
  
   public static void main (String[] args)
   {
      final double OUNCES_PER_POUND = 16.0;
      
      double pricePerPound; // price per pound
      
      double weightOunces; // weight in ounces
      
      double weight; // weight in pounds
      
      double totalPrice; // total price for the item
      
      Scanner scan = new Scanner(System.in);
      
      
   	// Formats for money and weight
       
      NumberFormat money = NumberFormat.getCurrencyInstance();
       
      DecimalFormat fmt = new DecimalFormat("0.##");
   
     
   	// Read user input
             
      System.out.println ("Welcome to the CS Deli!!\n ");
       
      System.out.print ("Enter the price per pound of your item: ");
     
      pricePerPound = scan.nextDouble();
   
      System.out.print ("Enter the weight (ounces): ");
      
      weightOunces = scan.nextDouble();
      
      
   	// Convert ounces to pounds and compute the total price
   	  
      weight = weightOunces / OUNCES_PER_POUND;
   	  
      totalPrice = pricePerPound * weight;
      
      
   	// Print the label
      
      System.out.println ("\n****CS Deli****");
   	 
      System.out.println ("Weight: " + fmt.format(weight) + " pound(s)");
   	 
      System.out.println ("Unit Price: " + money.format(pricePerPound) + " per pound");
   	 
      System.out.println ("TOTAL: " + money.format(totalPrice) + "\n");
   }
}

