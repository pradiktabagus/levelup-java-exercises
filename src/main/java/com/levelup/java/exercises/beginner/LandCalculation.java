package com.levelup.java.exercises.beginner;

import java.util.Scanner;

/**
 * This program demonstrates a solution to the to the Land Calculation exercise.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercise'>Land calcuation</a>
 * 
 */
public class LandCalculation {

	// Steps: 
	// declare tract/acres as double 
	// ask user for input 
	// calculate acres
	// Since feet per acre doesn't change it can be a constant
	// 
	
	// TODO:  
	// consider entering tract as another variable
	// validation of tract
	
	private static final int FEET_PER_ACRE = 43560;

	public static void main(String[] args) {
		double tract; // tract in feet
		double acres; // To hold number of acres

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Tell the user what the program will do.
		System.out.println("This program will calculate number of acres.");

		// Get the tract in feed.
		System.out.print("Enter tract in feed: ");
		tract = keyboard.nextDouble();
		
		acres = calculateAcres(tract);

		// Display the results.
		System.out.println("A tract of land with " + tract + " square feet has " + acres + " acres.");
	}

	/**
	 * Should calculate the number of acres.
	 * 
	 * @param tract
	 * @return double
	 */
	static double calculateAcres(double tract) {
		return tract / FEET_PER_ACRE;
	}

}
