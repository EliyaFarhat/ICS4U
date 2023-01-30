package ool;
import java.util.ArrayList;
import java.util.Scanner;

import BankAssignment.Users;
public class bankingMain {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	ArrayList<User> arrUser = new ArrayList<>();

	arrUser.add(new User("ido", "1234", 93, "ido", "ben haim"));
	arrUser.add(new User("joe", "4321", 100, "joe", "chen"));
	arrUser.add(new User("abdul", "3456", 99, "abdul", "asad"));
	arrUser.add(new User("param", "parameter", 95, "param", "parikh"));
	arrUser.add(new User("shaan", "putUrMaskOn", 85, "shaan", "tandon"));
	arrUser.add(new User("eliyah", "valorant", 95, "eliyah", "farhat"));

	Scanner in = new Scanner(System.in);
	User user = null;
	String choice = "";
	String quit = "";
	
		while (!choice.equalsIgnoreCase("Yes")) {
			
			System.out.println("Do you already have a bank account? Yes/No");
			choice = in.nextLine();
			
			if (choice.equalsIgnoreCase("No")) {
				
				System.out.println("Enter your username");
				String newUsername = in.nextLine();
				System.out.println("Enter your password");
				String newPassword = in.nextLine();
				System.out.println("Enter your first name");
				String firstName = in.nextLine();
				System.out.println("Enter your last name");
				String lastName = in.nextLine();
				
				user = findUserByUsername(newUsername, arrUser);
				
				if (user == null) {
					arrUser.add(new User(newUsername, newPassword, 0, firstName, lastName));
					break;
				}else {
					System.out.println("the account already exists");
					continue;
				}
				
			}
		}
		while (true) {
			
			System.out.println("enter username:");
			String username = in.nextLine();

			user = findUserByUsername(username, arrUser);
			if (user == null) {
				System.err.println("Account not found");
				continue;
			}

			System.out.println("enter password:");
			String password = in.nextLine();

			if (!user.getPassword().equals(password)) {
				System.err.println("Wrong password");
				continue;
			} else
				break;
		}
		
		System.out.println("Logged in");
		do{
			
		System.out.println("-----------------------------");
		System.out.println("press 1 to deposit");
		System.out.println("press 2 to withdraw");
		System.out.println("press 3 for account info");
		System.out.println("press 4 to wait for 1 month and check your balance");
		String press = in.nextLine();
		
		if (press.equals("1")) {
			System.out.println("Please enter the amount that you wish to deposit");
			double deposit = in.nextDouble();
			if(deposit > 0){
				in.nextLine();
				user.Deposit(deposit);
			}else{
				while(deposit < 0){
					deposit = 0;
			        System.out.println("Please input a vaild number");
			        deposit = in.nextDouble();
			        if(deposit > 0){
			        	in.nextLine();
						user.Deposit(deposit);
			        }else continue;
				}
			}
			
			
		} else if (press.equals("2")) {
			System.out.println("Please enter the amount that you wish to withdrawn");
			double withdraw = in.nextDouble();
			if(withdraw > 0){
				in.nextLine();
				user.WithDraw(withdraw);
			}else{
			while(withdraw < 0){
				withdraw = 0;
		        System.out.println("Please input a vaild number");
		        withdraw = in.nextDouble();
		        if(withdraw > 0){
		        	in.nextLine();
					user.WithDraw(withdraw);
		        }else continue;
		        }
			}
		} else if(press.equals("4")){
			
			System.out.println("haha");
		}
		
		System.out.println("-----------------------------");
		System.out.println(user);
		System.out.println("-----------------------------");
		
		System.out.println("Would you like to log out? Yes/No");
		quit = in.nextLine();
		
	}while (quit.equalsIgnoreCase("No"));
		System.out.println("Goodbye, have a nice day");
}

/**
 * Get a user given a username.
 * 
 * @param username
 *            the user to find
 * @param arr
 *            the user array to search
 * @return the user object, if not find return null
 */
private static User findUserByUsername(String username, ArrayList<User> arr) {
	for (User user : arr) {
		if (user.getUsername().equals(username)) {
			return user;
		}
	}
	return null;
}

}





