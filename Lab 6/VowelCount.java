/**

* Lab Assignment #6
    
* VowelCount.java Counts the number of vowels in a string
  
* @author Patricia Wilthew
    
* Pledge: "I pledge my Honor that I have not cheated, and will not cheat, on this assignment." Patricia Wilthew.
    
*/

import java.util.Scanner;

public class VowelCount
{
	public static void main(String[] args)
	{
		String string_1;
     
		char[] arrayOfString;
     
		char ch;
     
		int numberOfA = 0;
     
		int numberOfE = 0;
     
		int numberOfI = 0;
     
		int numberOfO = 0;
     
		int numberOfU = 0;
     
		Scanner scan = new Scanner(System.in);
     

		// Ask user for input
		System.out.print("Enter a string of characters: ");
     
     
		// string_1 contains the string entered by the user
		string_1 = scan.nextLine();
	 
	 
		// string_1 now contains string_1 in lower case
		string_1 = string_1.toLowerCase();
	 
	 
		// arrayOfString contains an array with the chars of the string in lower case
		arrayOfString = string_1.toCharArray();
	 
	 
		// For each char in the string, count the number of vowels	 
		for (int i = 0 ; 0 <= i && i < string_1.length() ; i++)
		{	
			ch = arrayOfString[i];
	 	
			switch (ch)
			{
				case 'a':
			
					numberOfA = numberOfA + 1;
			
					break;
				
				case 'e':
			
					numberOfE = numberOfE + 1;
				
					break;

				case 'i':
			
					numberOfI = numberOfI + 1;
				
					break;

				case 'o':
			
					numberOfO = numberOfO + 1;
				
					break;
             
				case 'u':
			
					numberOfU = numberOfU + 1;
				
					break;
			}
             
		}
         
		//Output results
		System.out.println("Number of each vowel in the string: ");
     
		System.out.println("a: " + numberOfA);
     
		System.out.println("e: " + numberOfE);
     
		System.out.println("i: " + numberOfI);
     
		System.out.println("o: " + numberOfO);
     
		System.out.println("u: " + numberOfU);
     
	}
}
