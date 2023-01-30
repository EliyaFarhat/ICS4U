package ImperialToMetric;
import java.util.*;
class Main {
  public static void main(String[] args) {
     while(true)
	        {
	            //Building blocks and user greeting
	            Scanner input = new Scanner (System.in);
	            System.out.println("\nChoose from the following list of programs using the numbers:");
	            System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	            String programList = ("1. Inches to Centimeters\n2. Feet to Centimeters\n3. Yards to Meters\n4. Miles to Kilometers \n5. Exit");
	            System.out.println(programList);
	            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	        
	            int userChoice = input.nextInt();
	            if(userChoice == 5)
	            {
	                //Break if 6
	                System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	                System.out.println("Bye!");
	                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	                break;
	            }
	            //First user choice, inches to centimeters
	            else if (userChoice == 1){
	            	System.out.println("Enter a value for inches.");
	            	double a = input.nextDouble();
	            	toCentimeter(a);
	            	System.out.println("\n");
	            	System.out.println(a + " inches to centimeters is: " + Math.round(toCentimeter(a)*100.0)/100.0 + " cm.");
	            	System.out.println("\n");
	            }
	            else if (userChoice == 2){
	            	System.out.println("Enter a value for feet.");
	            	double a = input.nextDouble();
	            	feetToCenti(a);
	            	System.out.println("\n");
	            	System.out.println(a + " feet to centimeters is: " + Math.round(feetToCenti(a)*100.0)/100.0 + " cm.");
	            	System.out.println("\n");
	            }
	            else if (userChoice == 3){
	            	System.out.println("Enter a value for yards.");
	            	double a = input.nextDouble();
	            	yardToMeter(a);
	            	System.out.println("\n");
	            	System.out.println(a + " yards to meters is: " + Math.round(yardToMeter(a)*100.0)/100.0 + " m.");
	            	System.out.println("\n");
	            }
	            else if (userChoice == 4){
	             	System.out.println("Enter a value for miles.");
	            	double a = input.nextDouble();
	            	milesToKilo(a);
	            	System.out.println("\n");
	            	System.out.println(a + " miles to kilometers: " + Math.round(milesToKilo(a)*100.0)/100.0 + " km.");
	            	System.out.println("\n");
	           }
	            else {
	                System.out.println("\n\nInvalid choice, try again.\n\n");
	            }
	    
	         
	        }
	   }
	 //Methods for calculations.
	 public static double toCentimeter(double a1){
		 return a1 * 2.54;
	 }
	 public static double feetToCenti(double a2){
		 return a2 * 30.48;
	 }
	 public static double yardToMeter(double a3){
		 return a3/1.094;
	 }
	 public static double milesToKilo(double a4){
		 return a4 * 1.609;
	 }
}