//*************************************************************
// TempConv.java		@author: Patricia Wilthew
//
// This program prints a range of converted temperature
// (from Celsius to Fahrenheit) to a text file.
//
// “I pledge my Honor that I have not cheated, 
//   and will not cheat, on this assignment.” Patricia Wilthew
//*************************************************************
import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

public class TempConv
{
   public static void main(String[] args) throws IOException
   {
     final int BASE = 32;
     final double CONVERSION_FACTOR = 9.0/5.0;
     
     // Variables for Starting and ending Celsius Temp
     double celsius1;
     double celsius2;
     
	 // Variable Fahrenheit Temperatures
	 double fahr;
     
     // Decimal Format
	 DecimalFormat fmt = new DecimalFormat("0.##");
     
     // For keyboard input
     Scanner scan = new Scanner(System.in);
     
     // Get starting temperature
	 System.out.println("What is the starting temperature (Celsius): ");
     celsius1 = scan.nextDouble();

     // Get ending temperature
	 System.out.println("What is the ending temperature (Celsius): ");
     celsius2 = scan.nextDouble();
     
     scan.nextLine(); // get newline character [Enter]
   
     // Open the file.
	 PrintWriter outfile = new PrintWriter("TempTable.txt");

     // Print table header to the file
	 outfile.println("Celsius Temperature\t Fahrenheit Temperature");
 
	 // Get data and write to the file
     for (double temp = celsius1; temp <= celsius2; temp++)     
     {
         // Print Celsius Temperature to the file
         outfile.print("\t" + fmt.format(temp) + "\t");

         // Convert Temperature
         fahr = temp*CONVERSION_FACTOR + BASE;
         
         // Print Fahrenheit Temperature to the file
		 outfile.println("\t\t" + fmt.format(fahr));
     }

     // Close the file.
     outfile.close();
     
     // Status message printed
     System.out.println("Results posted to TempTable.txt");
   }
}