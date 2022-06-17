package phonebook;

import java.util.Scanner;

public class PhoneBookMain  {
	public static void main(String[] args) {
		menu();
		
	}
	public static void menu() {
		PersonsList directory = new PersonsList();
		
		

		int choice = 0;

		while (choice != 6) {
			choice = getMenu();
			switch (choice) {
			case 1:
				directory.addPerson();
				break;
			case 2:
				directory.getPeople();
				break;
			case 3:
				System.out.println("Enter the last name of the contact you want to pull up: ");
				directory.getPerson();
				break;
			case 4:
				System.out.println("Enter the last name of the contact you would like to delete: ");
				directory.deletePerson();
				break;
			case 5:
				directory.sortAlphabetArray();
				break;
			case 6:
				System.out.println("Thank You for using!");
				break;
			default:
				System.out.println("wrong input choice");
				break;
			}
//			System.out.println("Please enter your choice: \n 1: add a contact \n 2: get all contacts \n 3: search by last name \n 4: delete a contact by last name");
//			choice = in.nextInt();
//		}
		}
		
		

	}
	public static int getMenu() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("**********Welcome to Alan Rodriguez's Phone Book!**********");
		System.out.println("Please enter your choice: \n 1: Add A New Contact \n 2: Display All Contacts \n 3: Search By Last Name \n 4: Delete A Contact By Last Name \n 5: Display Contact Book In Alphabetical order \n 6:Exit Program ");
		
		int choice = in.nextInt();
		System.out.println();
		return choice;
	}
}
