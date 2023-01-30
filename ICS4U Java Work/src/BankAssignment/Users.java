package BankAssignment;
import java.util.ArrayList;

public class Users {

	private String username;
	private String password;
	private double balance;
	private String firstName;
	private String lastName;
	
	
	
	public Users(String username, String password, double balance, String firstName, String lastName) {
		
		this.username = username;
		this.password = password;
		this.balance = balance;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}




	public String getUsername() {
		return username;
	}




	public void setUsername(String username) {
		this.username = username;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public double getBalance() {
		return balance;
	}




	public void setBalance(double balance) {
		this.balance = balance;
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public double dePosit(double deposit) {
		balance += deposit;
		return balance;
	}
	
	
	
	public double withDraw(double withdraw){
		balance -= withdraw;
		return balance;
	}
	
	
	
	public boolean overDrawn() {
		return balance < 0;
	}
	
	
	
	public double accrueInterest(double interestRate){
		balance = balance*interestRate;
		return balance;
	}
	
	
	
	public String toString() {
		
		return "Username: " + username +"\nFirst name: " + firstName + "\nLast name: "+ lastName + "\nNew balance: $" + balance + (overDrawn() ? "\nOVERDRAWN" : "");

	}
	

}


