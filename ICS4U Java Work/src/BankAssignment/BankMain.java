package BankAssignment;
import java.util.*;
import java.util.ArrayList;

import ool.User;

public class BankMain {
	
	private static Users checkTrue(String username, ArrayList<Users> test) {
		for (Users check : test) {
			if (check.getUsername().equals(username)) {
				return check;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String choice = "";
		Users check = null;
		String username;
		String password;
		String action = "";
		ArrayList<Users> ppls = new ArrayList<>();
		ppls.add(new Users("EliyahFARHAT","1444", 1000000.0, "Eliyah", "Farhat"));
		ppls.add(new Users("SHAAN","hi", 142.0, "Shaan", "Tandon"));
		ppls.add(new Users("Ido","144", 1.0, "Ido", "Ido"));
		ppls.add(new Users("Abdul","14", 14.0, "Abdulhadi", "Asad"));
		
		while(!choice.equals("1")) {
			
			System.out.println("~~~~~~~~~~~~~~~BANK ACCOUNT~~~~~~~~~~~~~~~~");
			System.out.println("Welcome, choose from the following options:");
			System.out.println("1. Log in.");
			System.out.println("2. Sign up.");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			choice = scan.nextLine();
			
			if(choice.equals("2")) {
				
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Let's create an account. First, enter your desired username.");
				System.out.println("Creating an account with us starts you off with $100.");
				String newUser = scan.nextLine();
				System.out.println("Enter a password.");
				String newPass = scan.nextLine();
				System.out.println("Enter your first name.");
				String firstName = scan.nextLine();
				System.out.println("Enter your last name");
				String lastName = scan.nextLine();
				
				check = checkTrue(newUser, ppls);
				
				if (check == null) {
					ppls.add(new Users(newUser, newPass, 100, firstName, lastName));
					break;
				}
				else {
					System.out.println("Username is taken.");
					continue;
				}
			}
		}
		while(true) {
			
			System.out.println("Log in.");
			System.out.println("\nUsername:");
			username = scan.nextLine(); 
			check = checkTrue(username, ppls);
			if(check == null) {
				System.out.println("\nUsername does not exist.");
				continue;
			}
	
					System.out.println("\nPassword:");
					password = scan.nextLine();
					if(!check.getPassword().equals(password)) {
						System.out.println("\nIncorrect password.");
						System.err.println("Try again.");
						System.out.println("\nPassword:");
						password = scan.nextLine();
						if(check.getPassword().equals(password)) {
							break;
						}
						System.out.println("Too many tries, re-enter username.");
						continue;
					}
					else {
						break;
					}
					
		}
		
		System.out.println("\nLog in successful.\n");
		
		while(true) {
			System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Choose from the following options:");
			System.out.println("1. Deposit.");
			System.out.println("2. Withdraw. ");
			System.out.println("3. Info.");
			System.out.println("4. Accrue Interest.");
			System.out.println("5. Log out.");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			action = scan.nextLine();
			
			if(action.equals("1")) {
				System.out.println("Deposit amount:");
				double deposit = scan.nextDouble();
				if(deposit > 0) {
					scan.nextLine();
					check.dePosit(deposit);
					System.out.println("~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("Deposited $" + deposit);
					System.out.println(check);
					System.out.println("~~~~~~~~~~~~~~~~~~~~~");
				}
				while(deposit < 0) {
					deposit = 0;
					System.err.println("Invalid amount. Try again");
					deposit = scan.nextDouble();
					if(deposit > 0){
			        	scan.nextLine();
						check.dePosit(deposit);
						System.out.println("~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("Deposited $" + deposit);
						System.out.println(check);
						System.out.println("~~~~~~~~~~~~~~~~~~~~~");
						break;
			        }
				}
			}
			if(action.equals("2")){
				System.out.println("Withdraw amount:");
				double withdraw = scan.nextDouble();
				if(withdraw > 0) {
					scan.nextLine();
					check.withDraw(withdraw);
					System.out.println("~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("Withdrew $" + withdraw);
					System.out.println(check);
					System.out.println("~~~~~~~~~~~~~~~~~~~~~");
				}
				while(withdraw < 0) {
					withdraw = 0;
					System.err.println("Invalid amount. Try again.");
					withdraw = scan.nextDouble();
					if(withdraw > 0) {
						scan.nextLine();
						check.withDraw(withdraw);
						System.out.println("~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("Withdrew $" + withdraw);
						System.out.println(check);
						System.out.println("~~~~~~~~~~~~~~~~~~~~~");
						break;
					}
				}
			}
			if(action.equals("3")) {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~");
				System.out.println(check);
				System.out.println("~~~~~~~~~~~~~~~~~~~~~");
			}
			
			if(action.equals("4")) {
				System.out.println("Enter interest rate:");
				double interestRate = scan.nextDouble();
				if(interestRate > 0) {
					scan.nextLine();
					check.accrueInterest(interestRate);
					System.out.println("~~~~~~~~~~~~~~~~~~~~~");
					System.out.println(check);
					System.out.println("~~~~~~~~~~~~~~~~~~~~~");
					
				}
				while(interestRate < 0) {
					interestRate = 0;
					System.err.println("Invalid amount. Try again.");
					interestRate = scan.nextDouble();
					if(interestRate > 0) {
						scan.nextLine();
						check.accrueInterest(interestRate);
						System.out.println("~~~~~~~~~~~~~~~~~~~~~");
						System.out.println(check);
						System.out.println("~~~~~~~~~~~~~~~~~~~~~");
						break;
					}
				}
			}
			if(action.equals("5")){
				System.err.println("\nYou have logged out.");
				break;
			}
				
		}
	}
}
