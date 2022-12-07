package address_book;
import java.io.*;
import java.util.*;
import java.util.Scanner;
public class AddressBook {

	// An arrayList of Entries for storing information of colleagues
	private ArrayList<Entry> colleagues;
	
	// Create an empty AddressBook
	
	public AddressBook() {
		colleagues = new ArrayList<Entry>();
	}
	
	// Add an Entry to the AddressBook
	public void addEntry(Entry e) {
		colleagues.add(e);
	}
	
	// Remove an Entry from the AddressBook
	public void removeEntry(String s) {
		for(int i= 0;i< colleagues.size(); i++) {
			if(colleagues.get(i).getAddress().equals(s))
				System.out.println(colleagues.remove(i));
		}
	}
	
	//Search for a colleague information
	public int searchEntry(String s) {
		for(int i= 0;i< colleagues.size(); i++) {
			
			if(colleagues.get(i).getFirstName().equals(s) || colleagues.get(i).getlastName().equals(s) || colleagues.get(i).getAddress().equals(s)||colleagues.get(i).getPhoneNumber(s).equals(s)) { 
				System.out.println("found" + s);
				return i;
			}
		
		}
		return -1;
	}
	
	//Print the entries 
	public void printEntries() {
		for (int i=0;i<colleagues.size();i++)
            System.out.println(colleagues.get(i));
			

	}
	
	// Clear the address book
	public void deleteEntry() {
		this.colleagues.clear();
//		while (!colleagues.isEmpty())
//	        colleagues.remove(0);
        System.out.println("check");
      
	}
	
	// Quit the program
	public void quitProgram() {
		System.exit(0);
		
	}



		
	}
	

