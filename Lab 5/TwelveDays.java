/**

* Lab Assignment #5
    
* TwelveDays.java Prints out the verses to "The Twelve days of Christmas."

* depending on the number of days entered by the user
  
* @author Patricia Wilthew
    
* Pledge: "I pledge my Honor that I have not cheated, and will not cheat, on this assignment." Patricia Wilthew.
    
*/

import java.util.Scanner;

public class TwelveDays
{
   // --------------------------------------------------
   // Main reads a number of days and prints out the
   // verses of the song “The Twelve days of Christmas”
   // --------------------------------------------------
   
   public static void main(String[] args)
   {
      final int MAX = 12;
   
      int lastDay = 0;  
      
      String suffix; 
   
      Scanner scan = new Scanner(System.in);
      
   
      // Ask user for input until it is valid
      while (lastDay <= 0 || lastDay > MAX)
      {
         System.out.print("How many days? (1 to 12): ");
      
         lastDay = scan.nextInt();
      }
   
      // Loop control variable for song verses
      int day = 1;
   
      // Print "On the 'day' "
      while (day > 0 && day <= lastDay)
      {
         System.out.print("On the " + day);
       
       // Switch for the date suffix (st, nd, rd, th)
         switch(day)
         {
            case 1:
            
               suffix = "st";
                 
               break;
             
            case 2:
             
               suffix = "nd";
                 
               break;
               
            case 3:
            
               suffix = "rd";
               
               break;
               
            default:
            
               suffix = "th";
               
               break;
         }
         
         // Print " day of Christmas my true love gave to me"
         System.out.println(suffix + " day of Christmas my true love gave to me");
       
         // Switch for the gifts depending on the day
         switch(day)
         {
            case 12:
            
               System.out.println("Twelve drummers drumming,");
            
            case 11: 
            
               System.out.println("Eleven pipers piping,");
            
            case 10:
            
               System.out.println("Ten lords a-leaping,");
            
            case 9: 
            
               System.out.println("Nine ladies dancing,");
            
            case 8:
            
               System.out.println("Eight maids a-milking,");
            
            case 7:
            
               System.out.println("Seven swans a-swimming,");
            
            case 6: 
            
               System.out.println("Six geese a-laying,");
            
            case 5:
            
               System.out.println("Five golden rings");
            
            case 4:
            
               System.out.println("Four calling birds,");
            
            case 3: 
            
               System.out.println("Three French hens,");
            
            case 2:
            
               System.out.println("Two turtle doves, and");
            
            case 1:
            
               System.out.println("A partridge in a pear tree\n");
          
         }
       
         // Increment the value of day
         day = day + 1;
      }
    
   }

}