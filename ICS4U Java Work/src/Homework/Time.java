package Homework;
import java.util.*;
public class Time {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int h;
		int m;
		int s;
		System.out.println("Hello, input time in hours, minutes, and seconds.");
		System.out.println("\nHours: ");
		h = scan.nextInt();
		System.out.println("\nMinutes: ");
		m = scan.nextInt();
		System.out.println("\nSeconds: ");
		s = scan.nextInt();
		int hToS = h * 3600;
		int mToS = m * 60;
		int totalTime = hToS + mToS + s;
		
		System.out.println("\n" + h + " hour(s), " + m + " minute(s), and " + s + " seconds is equal to " + totalTime + " seconds." );
		

	}

}
