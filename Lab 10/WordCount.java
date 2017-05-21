//*************************************************************
// WordCount.java		@author: Patricia Wilthew
//
// This program asks the user for a word and checks to see
// the number of times it appears in 'The Raven'.
//
// “I pledge my Honor that I have not cheated, 
//   and will not cheat, on this assignment.” Patricia Wilthew
//*************************************************************
import java.util.Scanner;
import java.io.*;

public class WordCount
{
   public static void main(String[] args) throws IOException
   {
   	 // Word count variable
     int wcount = 0; 
     
     // Variables to store each word to compare and the input word 
     String word, entry;
     
     // Scanner to read user keyboard input
     Scanner scan = new Scanner(System.in);
     
     // Get input file in a File variable
     File inputfile = new File("theraven.txt");
     
     // Scanner to read the file inputfile. \W: Any Non-alphanumeric character
     Scanner fileScan = new Scanner(inputfile).useDelimiter("\\W");

	 // Welcome message
     System.out.println("This code lets a user enter a word " 
         + " and checks \'The Raven\' to see how many times "
         + "it appears.");
         
     // Ask the user for a word and store it in the entry variable    
     System.out.println("Enter a word to look for: ");
     entry = scan.nextLine();
     
     // Read lines from the file until no more are left
     while (fileScan.hasNext())
     {
     	 // Get next word
         word = fileScan.next();
         
         if (word.equalsIgnoreCase(entry)) // if word is equal to entry
         {
         	wcount += 1;
         }
     }

     // Close the file
     fileScan.close();

     // Print the number of times the word appears     
     System.out.println("The word " + entry + " appears " + wcount + " times.");
   }
}
