/*
 * Sam Platt
 * CS 257
 * Written Jan 14, 2020
 */

public class ClockTower {
	
	// CONSTANTS
	
	// INSTANCE VARIABLES
	
	private String clockName;
	private int currentHour;
	
	// OTHER CLASS VARIABLES
	
	private static int clockTowers = 0;
	
	// CONSTRUCTORS
	
	public ClockTower() {
		clockName = "Big Ben";
		currentHour = 0;
		
		clockTowers++;
	}
	
	public ClockTower(String name) {
		clockName = name;
		currentHour = 0;
		
		clockTowers++;
	}
	
	// CLASS METHODS
	
	// Returns the number of existing ClockTower objects.
	public static int numClockTowers() {
		return clockTowers;
	}
	
	// SERVICE INSTANCE METHODS
	
	// Returns the name of this ClockTower.
	public String getName() {
		return clockName;
	}
	
	// Returns the current hour on this ClockTower.
	public int getHour() {
		return currentHour;
	}
	
	// Sets the name of this ClockTower.
	public void setName(String name) {
		clockName = name;
	}
	
	// Advance the current hour on this ClockTower by numHours hours.
	// The hour will always be between 0 (midnight) and 23.
	public void advanceClock(int numHours) {
		for(int j = 0; j < numHours; j++) {
			advanceOneHour();
		}
	}
	
	// Returns a string containing the current state of this ClockTower as a sentence.
	public String toString() {
		return("The current time on " + clockName + " is " + currentHour + ":00");
	}
	
	
	// SUPPORT/HELPER INSTANCE METHODS
	
	/* 
	 * This method should output the name of the clock tower, followed by the current time, followed by the word "DONG" written numDongs times.
	 * All of the output from this method mmust be on a single line.
	 */
	private void ringBell (int numDongs) {
		// output the name of the clock tower,
		System.out.print(clockName + " ");
		
		// followed by the current time,
		System.out.print(currentHour + ":00");
		
		// followed by the word 'DONG' written numDongs times.
		for(int i = 0; i < numDongs; i++) {
			System.out.print(" DONG");
		}
		System.out.print("\n");
	}
	
	/*
	 * This method should increment the current hour and then invoke the ringBell method.
	 * It should pass ringBell a number of dongs corresponding to the current hour as follows:
	 * 	...two dongs if the current hour is noon (i.e., 12),
	 * 	...four dongs if the current hour is midnight (i.e., 0),
	 * 	...and one dong if the hour is any hour other than noon or midnight.
	 */
	private void advanceOneHour() {
		// get current hour.
		// increment current hour by 1.
		if(currentHour != 23) {
			currentHour++;
		} else {
			currentHour = 0;
		}
		
		// invoke the ringBell method.
		if(currentHour == 12) {
			ringBell(2);
		} else if(currentHour == 0) {
			ringBell(4);
		} else {
			ringBell(1);
		}
	}
}
