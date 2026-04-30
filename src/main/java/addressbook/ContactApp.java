package addressbook;

import java.util.Scanner;

/**
 * The class used to interact with the users
 * 
 * @author Manolo Nov 26, 2025
 */
public class ContactApp {

	final static AddressBook addressBook = new AddressBook();
	final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		byte option = 4;
		
		while(true) {
			showMenu();
			
			option = scanner.nextByte();
			System.out.println(option);
			
			if(option == 4) {
				System.out.println("Exit from the app");
				break;
			}
			else if(option == 1) {
				addContact();
			}
			else if(option == 2) {
				showContacts();
			}
			else {//when option is not 1, 2, or 4
				removeContact();
			}
			switch(option) {
			case 1:
				break;
			case 2:
				break;
			}
//			switch(option){
//			case: 1
//			case: 2
//			}
		}
		
		
	}

	private static void removeContact() {
		System.out.println("---remove contact from your address book------");
		// 1 The user introduce the name of the contact that he wants to eliminate
		System.out.println("Please enter the name");
		String name = scanner.nextLine();
		System.out.println(name);
		addressBook.removeContact(name);
		
		
	}

	private static void showContacts() {
		addressBook.showContacts();
	}

	private static void addContact() {
		System.out.println("---add contact to your address book------");
		// 1 The user introduce the phone number, name and other information about the
		// contact
		scanner.nextLine();
		System.out.println("Please enter the name");
		String name = scanner.nextLine();
		System.out.println(name);
		
		System.out.println("Please enter the phone number");
		String phoneNumber = scanner.nextLine();
		System.out.println(phoneNumber);
		
		System.out.println("Please enter the email");
		String email = scanner.nextLine();
		System.out.println(email);
		// 2 Create an object of "Contact" encapsulating all the data passed in the
		// first step
		Contact contact = new Contact(name, phoneNumber, email);
		// 3 Add the new object to the contact array
		addressBook.addContact(contact);
		System.out.println("The contact has been added successfully");
	}

	private static void showMenu() {
		System.out.println("1, Add contact");
		System.out.println("2, Show contacts");
		System.out.println("3, Remove contact");
		System.out.println("4, Exit");
	}
}
