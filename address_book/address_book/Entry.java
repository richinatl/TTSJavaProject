package address_book;


	public class Entry {
		private String firstName;
		private String lastName;
	    private String address;
	    private String phoneNumber;
	    
	 public void setFirstName(String privateFirstName) {
		 firstName = privateFirstName;
	 }
	 
	 public String getFirstName() {
		 return firstName;
	 }
	 
	 public void setLastName(String privateLastName) {
		 firstName = privateLastName;
	 }
	 
	 public String getlastName() {
		 return lastName;
	 }
	 
	 public void setAddress(String privateAddress) {
		 address = privateAddress;
	 }
	 
	 public String getAddress() {
		 return address;
	 }
	 
	 public void setPhoneNumber(String privatePhoneNumber) {
		 phoneNumber = privatePhoneNumber;
	 }
	 
	 public String getPhoneNumber(String privatePhoneNumber) {
		 return phoneNumber;
	 }
	 
	 @Override
	 public String toString() {
			System.out.println("=====================================================");
		 return "First Name:" +this.firstName +  "\nLast Name:" +this.lastName + "\nPhone Number:" +this.phoneNumber + "\nEmail=" +this.address;
		
	 }
	 
	 
	 public Entry (String firstName, String lastName, String address, String phoneNumber ) {
		 this.firstName = firstName;
		 this.lastName = lastName;
		 this.address = address;
		 this.phoneNumber = phoneNumber;
	 }
}
