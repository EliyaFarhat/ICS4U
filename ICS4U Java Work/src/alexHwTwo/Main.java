package alexHwTwo;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		double quarter = 0.25;
		double dime = 0.10;
		double nickel = 0.05;
		double pennies = 0.01;
		double qAmt;
		double dAmt;
        double nAmt;
  	    double pAmt;
  	    
	    System.out.println("\nWelcome, how many of each coin are in the jar?");
	    System.out.println("\nQuarters:");
	    qAmt = in.nextDouble();
	    System.out.println("\nDimes:");
	    dAmt = in.nextDouble();
	    System.out.println("\nNickels:");
	    nAmt = in.nextDouble();
	    System.out.println("\nPennies:");
	    pAmt = in.nextDouble();
	    
	    double qVal = qAmt * quarter;
	    double dVal = dAmt * dime;
	    double nVal = nAmt * nickel;
	    double pVal = pAmt * pennies;
	    double total = qVal + dVal + nVal + pVal;
	   
	    System.out.printf("\nThere is $%.2f ", total);
	    System.out.print("in the jar.");
		  


		
	}

}
