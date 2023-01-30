package AddressBooks;

public class Mobile extends BookFunctions {

	private String firstName;
	private String lastName;
	private String address;
	private String phoneNum;
	private boolean isMobile;
	
	public Mobile(String firstName, String lastName, String address, String phoneNum, boolean isMobile) {
		super(firstName, lastName, address, phoneNum);
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNum = phoneNum;
		this.isMobile = isMobile;
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

	public boolean isMobile() {
		return isMobile;
	}

	public void setMobile(boolean isMobile) {
		this.isMobile = isMobile;
	}
	
	public String toString() {
		return "First name: " + firstName + ", Last name: " + lastName + ", Address: " + address + ", Phone number: " + phoneNum + ", Mobile: " + isMobile + ".\n";
	}
}
