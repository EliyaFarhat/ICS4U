package AddressBooks;
import java.util.*;
public class BookFunctions {

	private String firstName;
	private String lastName;
	private String address;
	private String phoneNum;
	
	public BookFunctions(String firstName, String lastName, String address, String phoneNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNum = phoneNum;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public String toString() {
	
		return "First name: " + firstName + ", Last name: " + lastName + ", Address: " + address + ", Phone number: " + phoneNum + ".\n";
		
	}
}
