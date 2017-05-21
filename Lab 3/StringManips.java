/**

* Lab Assignment #3

* StringManips.java Tests several methods for manipulating String objects

* @author Patricia Wilthew

* Pledge: I pledge my Honor that I have not cheated, and will not cheat, on this assignment. Patricia Wilthew.

*/

import java.util.Scanner;

class StringManips {

   public static void main(String[] args) {

       String phrase;

    int phraseLength;  // number of characters in the phrase String

    int middleIndex;   // index of the middle character in the String

    String firstHalf;   // first half of the phrase String

    String secondHalf; // second half of the phrase String

    String switchedPhrase; // a new phrase with original halves switched

    String middle3; // middle characters of the phrase String
    
    String city; // a city's name entered by the user
    
    String state; // a state's name entered by the user 
 

    // read in a phrase

    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter a phrase:");

    phrase = scan.nextLine();


    // read in the user's city and a state
    
    System.out.println("Please enter your city:");

    city = scan.nextLine();
    
 
    System.out.println("Please enter your state:");

    state = scan.nextLine();
    

    // compute the length and middle index of the phrase

    phraseLength = phrase.length();

    middleIndex = phraseLength / 2;

 
    // get the substring for each half of the phrase
    
    firstHalf = phrase.substring(0, middleIndex);
    
    secondHalf = phrase.substring(middleIndex);
    

    // concatenate the firstHalf at the end of the secondHalf
    
    switchedPhrase = secondHalf + firstHalf;
 
 
    // get 3 middle characters of the phrase
    
    middle3 = phrase.substring(middleIndex-1, middleIndex+2);
    
    
    // replace each blank space of the phrase with an asterisc
    
    switchedPhrase = switchedPhrase.replace(" ","*");
    

    // print information about the phrase

    System.out.println();

    System.out.println("Original phrase: " + phrase);

    System.out.println("Length of the phrase: " + phraseLength + " characters");

    System.out.println("Index of the middle: " + middleIndex);

    System.out.println("Character at the middle index: " + phrase.charAt(middleIndex));
    
    System.out.println("Switched phrase: " + switchedPhrase);
    
    System.out.println("3 Middle characters: " + middle3);
    
    System.out.println(state.toUpperCase() + city.toLowerCase() + state.toUpperCase());

   }

}
