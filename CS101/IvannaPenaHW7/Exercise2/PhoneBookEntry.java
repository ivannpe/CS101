
public class PhoneBookEntry {
	// private class member variables
	private int Id = -1;
	private String firstName;
	private String lastName;
	private String email;
	private int zipcode;
	private long phoneNumber;
	
	//default constructor
	public PhoneBookEntry() {
		
	}
	//takes as arguments all attributes
	public PhoneBookEntry(int id, String fn, String ln, String mail, int zp, long pn) {
		Id = id;
		firstName = fn;
		lastName = ln;
		email = mail;
		zipcode = zp;
		phoneNumber = pn;
	}
	//accepts only firstName and phoneNumber
	public PhoneBookEntry(String fn,long pn) {
		firstName = fn;
		phoneNumber = pn;
	}
	// accepts only firstName
	public PhoneBookEntry(String fn) {
		firstName = fn;
	}
	//id
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}
	// firstname
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	// lastname
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	// email
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	// zipcode
	public int getzipcode() {
		return zipcode;
	}
	public void setzipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	// phone number
	public long getphoneNumber() {
		return phoneNumber;
	}
	public void setphoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	//print
	public void printBookEntry() {
		System.out.print("ID: " + Id + "Firstname: " + firstName + " Lastname: " + lastName + " Email: " + email + 
				" Zipcode: " + zipcode + " Phone Number: " + phoneNumber);
	}
}
