package AddressBooks;
import java.util.*;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<BookFunctions> book = new ArrayList<>();
		book.add(new BookFunctions("Eliyah", "Farhat", "124 Brightsview Dr.", "905-809-6961"));
		book.add(new BookFunctions("Abdul", "Asad", "122 Brightsview Dr.", "905-809-6931"));
		book.add(new Mobile("Joe", "Chen", "123 Brightsview Dr.", "905-809-2222", false));
		book.add(new Mobile("Shaan", "Tandonn", "144 Lol Dr.", "647-999-9999", true));
		book.add(new Mobile("Massimo", "Smith", "13 Lol Dr.", "647-459-9999", true));
		String firstName;
		String lastName;
		String address;
		String phoneNum;
		int landOrMobile;
		int choice;
		boolean isMobile1;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~ADDRESS BOOK~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Select an option:");
			System.out.println("1. View Entries.");
			System.out.println("2. Add Entry.");
			System.out.println("3. Edit Entry.");
			System.out.println("4. Delete.");
			System.out.println("5. Search.");
			System.out.println("6. Exit.");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			choice = scan.nextInt();
			
			if(choice == 1) {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~ENTRIES~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				for(int i = 0; i < book.size(); i++) {
					
				    System.out.print((book.get(i)).toString());
				}
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
			}
			else if(choice == 2) {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~ADDING ENTRY~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("First name: ");
				scan.nextLine();
				String newName = scan.nextLine();
				System.out.println("Last name: ");
				String newLastName = scan.nextLine();
				System.out.println("Address: ");
				String newAddress = scan.nextLine();
				System.out.println("Phone number: ");
				String newPhoneNum = scan.nextLine();
				System.out.println("Mobile or Landline?");
				System.out.println("1. for Mobile, 2. for Landline");
				landOrMobile = scan.nextInt();
				if(landOrMobile == 1) {
					isMobile1 = true;
					book.add(new Mobile(newName, newLastName, newAddress, newPhoneNum, true));
					System.out.println("~~~~~~~~~~~~~~~~~UPDATED ENTRIES~~~~~~~~~~~~~~~~~~");
					for(int i = 0; i < book.size(); i++) {
						
					    System.out.print((book.get(i)).toString());
					}
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				}
				else if(landOrMobile == 2) {
					isMobile1 = false;
					book.add(new Mobile(newName, newLastName, newAddress, newPhoneNum, false));
					System.out.println("~~~~~~~~~~~~~~~~~UPDATED ENTRIES~~~~~~~~~~~~~~~~~~");
					for(int i = 0; i < book.size(); i++) {
						
					    System.out.print((book.get(i)).toString());
					}
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					
				}
				
			}
			else if(choice == 3) {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~EDITING~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Enter the last name of the person you wish to edit: ");
				scan.nextLine();
				String search = scan.nextLine();
				for (int i = 0; i != book.size(); i++) {
					if(book.get(i).getLastName().matches(search)) {
						book.remove(i);
						System.out.println("Person Located. Edit the entry.");
						System.out.println("First name: ");
						String firstName2 = scan.nextLine();
						System.out.println("Last name: ");
						String lastName2 = scan.nextLine();
						System.out.println("Address: ");
						String address2 = scan.nextLine();
						System.out.println("Phone number: ");
						String newPhoneNum2 = scan.nextLine();
						
						book.add(new BookFunctions(firstName2, lastName2, address2, newPhoneNum2));
						
					}
				
				}
			}
			else if(choice == 4) {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~DELETING~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Enter the last name of the person you wish to remove: ");
				System.out.println("You can not remove the person at the bottom of the list.");
				scan.nextLine();
				String search = scan.nextLine();
				for (int i = 0; i != book.size(); i++) {
					if(book.get(i).getLastName().matches(search)) {
						book.remove(i);
					}
				}
			}
			else if(choice == 5) {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~SEARCHING~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Enter the last name of the person you wish to search: ");
				scan.nextLine();
				String search = scan.nextLine();
				for (int i = 0; i != book.size(); i++) {
					if(book.get(i).getLastName().matches(search)) {
						System.out.println(book.get(i));
					}
				}
			}
			else if(choice == 6) {
				System.out.println("Program closed.");
				break;
			}
		}
		
		
	}

}
