package ool;
import java.util.Scanner;
import java.util.ArrayList;
public class User {
	private String username;
	private String password;
	private double balance;
	private String firstName;
	private String lastName; 

	public User(String username, String password, double balance, String firstName, String lastName) {
		this.username = username;
		this.password = password;
		this.balance = balance;
		this.firstName = firstName;
		this.lastName = lastName;
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

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public double Deposit(double deposit) {
		balance += deposit;
		return balance;
	}

	public double WithDraw(double withdraw) {
		balance -= withdraw;
		return balance;
	}

	public boolean isOverDrawn() {
		return balance < 0;
	}
	public double monthBalance(){
		return balance*1.24; 
	}
	@Override
	public String toString() {
		// String s = "username:" + username + "\n balance=" + balance;
		// if(isOverDrawn())
		// s+="\nYou are overdrawn";
		// return s;
		return "Username:" + username +"\nFirst name:" + firstName + "\nLast name:"+ lastName + "\nbalance:" + balance + (isOverDrawn() ? "\nYou are overdrawn" : "");

	}

}
