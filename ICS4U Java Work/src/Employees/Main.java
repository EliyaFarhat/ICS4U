package Employees;
import java.util.*;



	
public class Main {
	
	
	//Main
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice;
		String firstName;
		String lastName;
		int employeeNo;
		double payRate;
		double hoursWorked;
		double minimumWage = 15.00;
		while(true) {
			System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Welcome, choose from the following options.");
			System.out.println("1. Check employee info.");
			System.out.println("2. Exit.");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			choice = scan.nextInt();
			if(choice == 1) {
				
				System.out.println("Please fill in the following.");
				System.out.println("First name:");
				scan.nextLine();
				firstName = scan.nextLine();
				System.out.println("Last name:");
				lastName = scan.nextLine();
				System.out.println("Employee no.:");
				employeeNo = scan.nextInt();
				System.out.println("Hours worked:");
				hoursWorked = scan.nextDouble();
				
				Employee users = new Employee(lastName, firstName, employeeNo, hoursWorked); 
				users.employeePayRate(hoursWorked, minimumWage);
				
				System.out.println(users);
				
			}
			else if(choice == 2) {
				System.out.println("Program closed.");
				break;
			}
			else {
				System.out.println("Invalid. Try again.");
			}
			
		}
	
		
		
	}

}
