/**

* Lab Assignment #6
    
* Salary.java Computes the amount of a raise and the new salary for

*  one or more employees. If the employee sells 100 or more cars,

*  the employee receives a higher raise.
  
* @author Patricia Wilthew
    
* Pledge: "I pledge my Honor that I have not cheated, and will not cheat, on this assignment." Patricia Wilthew.
    
*/

import java.util.Scanner;

import java.text.NumberFormat;


public class Salary
{
	public static void main (String[] args)
	{
		final int CARS = 100; 		// car threshold
       
		String employeeName;   		// name of employee
       
		double currentSalary; 		// employee's current salary
       
		double raise = 0;         	// amount of the raise
       
		double newSalary;     		// new salary for the employee
       
		String response;       		// response
       
		int carsSold;         		// number of cars sold

		Scanner scan = new Scanner (System.in);
       
		NumberFormat money = NumberFormat.getCurrencyInstance();
       

		// Repeat every time response == "y"  (Assignment is at the end)
		do
		{
			// Ask Employee's name
			System.out.println("Enter the employee's name: ");

			employeeName = scan.nextLine();
			
			// Ask Employee's salary
			System.out.println("Enter the current salary: ");
			
			currentSalary = scan.nextDouble();
			
			// Validate salary
			while (currentSalary < 10000 )
			{
				System.out.println("Salary cannot be less than $10000.");

				System.out.println("Re-enter the current salary: ");
				
				currentSalary = scan.nextDouble();
				
			}
			
			// Ask the number of cars sold by the employee
			System.out.println("Enter the number of cars " + employeeName + " sold this year: ");
			
			carsSold = scan.nextInt();
			
			// Validate number of cars
			while (carsSold < 0 )
			{
				System.out.println("That's clearly invalid.");

				System.out.println("Re-enter the number of cars " + employeeName + " sold this year: ");
				
				carsSold = scan.nextInt();
				
			}
			
			// Compute raise
			raise = (carsSold >= CARS) ? currentSalary * 6 / 100: currentSalary * 1.5 / 100;

			// Compute the new salary
			newSalary = currentSalary + raise;
   			
   			// Print the results
			System.out.println("Name: " + employeeName);
			
			System.out.println("Current Salary: " + money.format(currentSalary));
			
			System.out.println("Amount of raise: " + money.format(raise));	
			
			System.out.println("New salary: " + money.format(newSalary));					
			
			
			// Ask user: Run the program again?
			System.out.println("Run the program again? (y/n) : ");
       			
			scan.skip("\n");   //Skips newline character

			response = scan.nextLine();

       
		} while (response.equals("y")); //end do while
	}

}
