//****************************************************************************************
//  KennelVer2.java       Author: Patricia Wilthew
//
// This is the driver program for the DogVer2 class
//
// “I pledge my Honor that I have not cheated, and will not cheat, on this assignment.” Patricia Wilthew
//****************************************************************************************
import java.util.*;

public class KennelVer2
{
	//------------------------------------------------------
	// Creates and exercises some Dog objects.
	//------------------------------------------------------
	public static void main (String[] args)
	{
		Scanner scan = new Scanner (System.in);
		
		// Create objects - test constructor 
		DogVer2 d1 = new DogVer2("Cooper", 1);
		DogVer2 d2 = new DogVer2("Pico", 2);
		DogVer2 d3 = new DogVer2("Remi", 7);
		DogVer2 d4 = new DogVer2("Kroogs", 3);
		DogVer2 d5 = new DogVer2();
		
		System.out.print("Enter the name of the new dog: ");
		String newDogsName = scan.nextLine();
		
		System.out.print("Enter the age of the new dog: ");
		int newDogsAge = scan.nextInt();
		
		// Validate age is positive
		while (newDogsAge < 0 )
		{
			System.out.println("Age can't be negative. ");
			System.out.println("Try again: ");
			newDogsAge = scan.nextInt();
		}
		
		d5.setName(newDogsName);
		d5.setAge(newDogsAge);
		d5.update();
		
		// Test toString
		System.out.println(d1); 
		System.out.println(d2); 
		System.out.println(d3); 
		System.out.println(d4);
		System.out.println(d5);
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
							+ " years old in person-years.\n");
		
		System.out.println("This code provided info on " + DogVer2.getNumberOfInstances() + " dogs.");
   }
}
 