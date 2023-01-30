package Employees;

public class Employee {
	private String lastName;
	private String firstName;
	private int employeeNo;
	private double payRate;
	private double hoursWorked;
	private static double minimumWage=15.00;

	
	//Constructor
	public Employee(String lastName, String firstName, int employeeNo, double hoursWorked) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.employeeNo = employeeNo;
		this.payRate = payRate;
		this.hoursWorked = hoursWorked;
	}

	//Getters and setters
	
	public String getLastName() {
		return lastName;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public int getEmployeeNo() {
		return employeeNo;
	}


	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}


	public double getPayRate() {
		return payRate;
	}


	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}


	public static double getMinimumWage() {
		return minimumWage;
	}


	public static void setMinimumWage(double minimumWage) {
		Employee.minimumWage = minimumWage;
	}
	
	public double employeePayRate(double hoursWorked, double minimumWage) {
		payRate = hoursWorked*minimumWage;
		return payRate;
	}
	
	public String toString() {
		return "\nFirst name: " + firstName + "\nLast name: " + lastName + "\nEmployee no.: " + employeeNo + "\nHours worked: " + hoursWorked + "\nPay rate: " + payRate + "\nWage: $" + minimumWage + "/hr" + "\n\nHi " + firstName + " you made: $" + payRate;
	}
}
