package Homework;
import java.util.*;
public class Average {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x;
		double y;
		double z;
		
		System.out.println("This program takes the average of three numbers.");
		System.out.println("Integer one: ");
		x = scan.nextDouble();
		System.out.println("Integer two: ");
		y = scan.nextDouble();
		System.out.println("Integer three: ");
		z  = scan.nextDouble();
		
		double average = (x + y + z)/3;
		
		System.out.println("Average: " + average + ".");
		

	}

}
