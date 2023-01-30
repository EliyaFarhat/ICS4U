package Homework;

import java.util.Scanner;

public class Float {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float x;
		float y;
		
		System.out.println("This program returns the sum, difference, and product of two floating point numbers.");
		System.out.println("\nTo begin, enter two integers.");
		System.out.println("\nFirst number: ");
		x = scan.nextFloat();
		System.out.println("\nSeconds number: ");
		y = scan.nextFloat();
		
		System.out.println("Sum: " + (x + y));
		System.out.println("Difference: " + (x-y));
		System.out.println("Product: " + (x*y));
		
	}

}
