/* Student Name: Jennifer Tran
 * Lab Professor: Mohammed Patoary
 * Due Date: October 1,2021
 * Modified: September 28,2021
 * Description: Create a program estimating the paintable surface area of industrial silos
 */

import java.util.Scanner; // Import scanner class for inputs
public class Exercise02 { // This class will allow the user to input height/ diameter to calculate the surfaceArea
public static void main(String[]arg) { // start 
		
		// declare variables = 0
		double height = 0;
		double diameter = 0;
		double surfaceArea = 0;
		double radius = 0;
		
	    Scanner keyboard = new Scanner (System.in); // Class for users input
	
		System.out.print("Enter the height:"); // Output string
		height = keyboard.nextDouble(); // Input height
		
		System.out.print("Enter the diameter:");// Output string
		diameter = keyboard.nextDouble(); // Input diameter
		radius = diameter/2; // Declare radius to half a diameter
	

// calculating the surface area of the silo
		surfaceArea = (Math.PI * Math.pow(radius, 2) + (2 * Math.PI * radius * height)); // surfaceArea calculation
		surfaceArea = Math.round(surfaceArea); // Rounding calculation
	
		System.out.println("The surface area is: "+ surfaceArea +" square meters");// print output of results of surfaceArea
	 
		System.out.println("Program by Jennifer Tran");// prints output of programmer
	
	}// End of main method
	
}// end of class