//****************************************************************************************
//  Kennel.java       Author: Patricia Wilthew
//
// This is the driver program for the Dog class
//
// “I pledge my Honor that I have not cheated, and will not cheat, on this assignment.” Patricia Wilthew
//****************************************************************************************
public class Kennel
{
	//------------------------------------------------------
	// Creates and exercises some Dog objects.
	//------------------------------------------------------
	public static void main (String[] args)
	{
		// Create objects - test constructor 
		Dog d1 = new Dog("Cooper", 1);
		Dog d2 = new Dog("Pico", 2);
		Dog d3 = new Dog("Remi", 7);
		Dog d4 = new Dog("Kroogs", 3);
		
		// Test toString
		System.out.println(d1); 
		System.out.println(d2); 
		System.out.println(d3); 
		System.out.println(d4);
		System.out.println();
		
		// Retrieve a name: call getName from an output statement
		System.out.print(d4.getName() + " also answers to the name ");

		// Update a name
		String newname = "Kruger";

		// Set new name
		d4.setName(newname);
		
		// Print updated name
		System.out.println(d4.getName());
     	System.out.println();
     
		// Retreive and update an age
		int newage;
		newage = d3.getAge() + 1;   
		
		// Set new age
		d3.setAge(newage);
		
		// Print new age for the dog. Call personYears here
		System.out.println("Happy Birthday, " + d3.getName() + "!");
		
		System.out.println("You are now " + d3.getAge() + ", which is " + d3.personYears()
							+ " years old in person-years.");
   }
}
 