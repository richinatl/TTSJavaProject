package address_book;

import java.util.*;


import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		// Instantiate AddressBook object
	AddressBook vipBook = new AddressBook();
	
	// create menu for for the 5 choices
	menu1();
		int choice = scanner.nextInt();
		while (true) {
			
			if(choice ==1) {
			//Reads in all appropriate information.");
   		System.out.print("\nEnter your colleague\'s first name:");
   		String firstName = scanner.next();
   		System.out.print("\nEnter your colleague\'s last name:");
    		String lastName = scanner.next();
    		System.out.print("\nEnter your colleague\'s email:");
    		String address = scanner.next();
    		System.out.print("\nEnter your colleague\'s phone Number:");
    		String phoneNumber = scanner.next();
   		//a parameter to the addContact method.
   		vipBook.addEntry(new Entry( firstName , lastName, address, phoneNumber)); 
   		System.out.println("\nAdded new entry!");
			}
			
				    	
		// Implement address removal by using email
				
			else if (choice == 2) {
				System.out.print("\nEnter an entry's email to remove: ");
				String email = scanner.next();
				System.out.println("Deleted the following entry: ");
				vipBook.removeEntry(email);
				vipBook.toString();
				
				
			}
			
			// Implement search
			else if(choice== 3) {
				int checkValid = -1;
			 menu2();
			 int option = scanner.nextInt();
			 while(option!=6) {
				
			 
			 if(option==1) {
					 String firstname = scanner.next();
					 checkValid = vipBook.searchEntry(firstname);
				 }
				 else if(option==2) {
					 String last = scanner.next();
					 checkValid = vipBook.searchEntry(last);
				 }
				 
				 else if(option ==3) {
					 String phone = scanner.next();
					 checkValid = vipBook.searchEntry(phone);
				 }
				 else if(option== 4) {
					 String email = scanner.next();
					 checkValid = vipBook.searchEntry(email);
				 }
			 }
			System.out.println("check valide = " + checkValid);
			}
			
			// print all the entries
			else if(choice == 4) {
				vipBook.printEntries();
			}
			
			// clear the address book
			else if(choice == 5) {
				vipBook.deleteEntry();
				System.out.println("\nThe address book is clear");
			}
			

			// Quit 

			else if(choice == 6) {
				System.out.println("BYE");
			vipBook.quitProgram();
						}
			menu1();

			choice = scanner.nextInt();
			}
		}
		    
              public static void menu1() {
            	System.out.println("=====================================================");
				System.out.println("1.Add an entry.");
				System.out.println("2.Remove an entry");
				System.out.println("3.Search for a specific entry");				
				System.out.println("4.Print Address Book");
				System.out.println("5.Delete Book");
				System.out.println("6.Quit.");
				System.out.println("=====================================================");
				System.out.print("Please choose what you'd like to do with the database: ");
				
}
              public static void menu2() {
            		System.out.println("=====================================================");
        			System.out.println("1.First Name");
        			System.out.println("2.Last Name");
        			System.out.println("3.Phone Number");				
        			System.out.println("4.Email Adress");
        			System.out.println("\n=====================================================");
        			System.out.println("Chose a search type: ");
        			
        			//System.out.print("Enter your search: ");
              }


}	

