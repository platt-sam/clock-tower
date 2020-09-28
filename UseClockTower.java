/* 
 * Sam Platt
 * CS 257
 * Written Jan 14, 2020
 */

import java.util.Scanner;

public class UseClockTower {
	
	// see: LECTURE 5 slide "Aside: A Useful Class Variable"
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String args[]) {
		String s;
		int hours;
		
		// Output the number of existing clock tower objects using the appropriate ClockTower method.
		System.out.println(ClockTower.numClockTowers() + " clock towers exist.");
		
		// Create a clock called "Big Ben" using the default constructor.
		ClockTower c0 = new ClockTower();
		
		// Create a clock called "Spasskaya Tower".
		ClockTower c1 = new ClockTower("Spasskaya Tower");
		
		// Output the current state of each clock tower as a sentence.
		System.out.println(c0.toString());
		System.out.println(c1.toString());
		
		// Get a number of hours to advance the clocks on both clock towers from the user.
		do {
			System.out.print("How many hours would you like to advance both clock towers? ");
			
			s = scan.nextLine();
			hours = Integer.parseInt(s);
		} while(hours <= 0); // Validate that the input number is positive, giving the user as many chances as required to enter a positive number.
		
		// Advance both clock towers the user input number of hours.
		c0.advanceClock(hours);
		c1.advanceClock(hours);
		
		// Advance Big Ben (only) by the same user input number of hours a second time.
		c0.advanceClock(hours);
		
		// Output the state of each clock tower as a sentence.
		System.out.println(c0.toString());
		System.out.println(c1.toString());
		
		// Output the number of existing clock tower objects using the appropriate ClockTower method.
		System.out.println(ClockTower.numClockTowers() + " clock towers exist.");
	}
}
