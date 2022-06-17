package phonebook;

import java.util.*;

public class PersonsList extends PhoneBookMain {

	static Person[] myListOfPeople = { new Person("Alan", "Rodriguez", "8088242780", "8461 Trammel Way"),
			new Person("Tina", "Puggington", "9161234567 ", "6001 Riverside Blvd "),
			new Person("Joe", " Budden ", "2091342348 ", "123 New York St "),
			new Person("Dearron ", " Fox", "9168438345 ", "5834 Sac Kings St"),
			new Person("Leah ", "Skapinok ", "9168432948 ", "3923 Street Way "),
			new Person("Jay ", "Z ", "9164935439 ", "3824 Beyonce Drive ")};
	static Person[] tempStringArray = new Person[myListOfPeople.length + 1];
	

	public PersonsList() {

	}

	public void addPerson() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a new contact in this format:");
		System.out.println("First name, Last name, phone number, address");
		String userInput = input.nextLine();
		String splitInput [] = userInput.split(",");
	
		
		Person newPerson = new Person(splitInput[0], splitInput[1], splitInput[2], splitInput[3]);
		Person[] tempStringArray = new Person[myListOfPeople.length + 1];
		for (int i = 0; i < myListOfPeople.length; i++) {
			tempStringArray[i] = myListOfPeople[i];
			//String names[]= splitInput[0].split(" ", 2);
		}
		tempStringArray[tempStringArray.length - 1] = newPerson;
		myListOfPeople = tempStringArray;
		System.out.println("Contact Successfully Added!");
	
	}
	public String printDirectory() {
		System.out.println(Arrays.toString(myListOfPeople));
		return Arrays.toString(myListOfPeople);
	}

	public void getPeople() {
		System.out.println(Arrays.toString(myListOfPeople));
	}

	public void getPerson() {
		Scanner in = new Scanner(System.in);
		String userSearchTerm = in.nextLine();
		String errorMessage = "sorry i didnt find that name";
		boolean error = false;
		for (int i = 0; i < myListOfPeople.length; i++) {
			if (myListOfPeople[i].lname.equals(userSearchTerm)) {
				System.out.println(myListOfPeople[i]);
			}
			else if(!myListOfPeople[i].lname.equals(userSearchTerm)){
				error = false;
			}
		}
		if(error == true) {
			System.out.println(errorMessage);
		}
	}

	public void deletePerson() {
		Scanner in = new Scanner(System.in);
		String userSearchTerm = in.nextLine();
		int size = myListOfPeople.length;
		for (int i = 0; i < myListOfPeople.length; i++) {
			if (myListOfPeople[i].lname.equals(userSearchTerm)) {
				myListOfPeople[i] = null;

				System.out.println("Updated Contact List: ");
				System.out.println(Arrays.toString(myListOfPeople));
				size--;
			}
		}
		Person[] tempArray = new Person[size];
		for (int i = 0; i < tempArray.length; i++) {
			if (myListOfPeople[i] != null) {
				tempArray[i] = myListOfPeople[i];
			} else {
				tempArray[i] = myListOfPeople[i + 1];
			}
		}
		myListOfPeople = tempArray;
		System.out.println(Arrays.toString(myListOfPeople));
	}
	public void printAlphabetArray() {
		

	String[] alphabet = new String[myListOfPeople.length];
		//populate temp array
		for(int i = 0; i< myListOfPeople.length; i++) {
			alphabet[i] = myListOfPeople[i].toString();	
		}
		}
		public void sortAlphabetArray () {
			  for(int i = 0; i <myListOfPeople.length -1; i++){
			    for(int j = i + 1; j < myListOfPeople.length; j++){
			      if(myListOfPeople[i].fname.charAt(0) > myListOfPeople[j].fname.charAt(0)){
			        Person tempVar = myListOfPeople[i];
			        myListOfPeople[i] = myListOfPeople[j];
			        myListOfPeople[j] = tempVar; 
			       
			      }
			   
			     
			    }
			  }
			    System.out.println(Arrays.deepToString(myListOfPeople));
			  }
			

		//sorts them alphabetically
		
		
		//print each person in the new array
//		for(int i = 0; i< alphabet.length; i++) {
//			for (int j = i + 1; j < alphabet.length; j++) {
//				if(alphabet[i] == myListOfPeople[i].getfname()) {
//				System.out.println(alphabet[i]);
//				} else {
//					System.out.println("ERROR");
//				}
//			}
//		}


			

	public String toString() {
		return Arrays.toString(myListOfPeople);
	}
}