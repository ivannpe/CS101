
import java.util.Scanner;

public class PhoneBookDirectory {
	  //an array of PhoneBookEntries
	  private PhoneBookEntry[] book;
	  private int count;

	  // Creates an empty PhoneBook object.
	  public PhoneBookDirectory() {
	    book = new PhoneBookEntry[6];
	    count = 0;
	  }

	  // Returns true if the current object is full.
	  public boolean full() {
	    return (count == 6);
	  }
	  
	  // Adds the entry into the object, returning 1 if the add
	  // was done successfully. If 0 is returned, no entry is added
	  public int addEntry(PhoneBookEntry entry) {
	    if(full()) {
	    	return 0;
	    }
	    
	    book[count] = new PhoneBookEntry(entry.getId(),entry.getfirstName(), entry.getlastName(), entry.getemail(), entry.getzipcode(), entry.getphoneNumber());
	    count++;
	    return 1;
	  }
	  // Prints out the entire object.
	  public void printBook() {

	    System.out.println("Phonebook Entries:");
	    for (int i = 0; i<count; i++) 
	      System.out.println(i+". "+book[i]);
	  }
	  //Search for an entry by Phone Number (Linear Search)
	  //return 1 if found 0 if not found
	  public int LinearSearchByPhoneNumber(long phoneNumber) {
		  for(int i = 0; i < book.length; i++){
			  if(book[i].getphoneNumber() == phoneNumber) {
				  return 1;
			  }
		  }
		  return 0;
	  }
	  
	  //Search for an entry by id (Using Binary Search)
	  public PhoneBookEntry SearchbyIdBinarySearch(int id) {
		  sortEntries(book);
		  int low = 0;
		  int high = book.length - 1;
		  while(high >= low) {
			  int mid = (low + high) / 2;
			  if(id < book[mid].getId()) {
				high = mid -1;  
			  }else if(id == book[mid].getId()) {
				return new PhoneBookEntry(book[mid].getId(), book[mid].getfirstName(), book[mid].getlastName(), book[mid].getemail(), book[mid].getzipcode(), book[mid].getphoneNumber());
			  }else {
				low = mid + 1;
			  }
		  }
		  return new PhoneBookEntry();
	  }
	  //find out how to sort by ID
	  //PhoneBookEntry[] book????
	  public static void sortEntries(PhoneBookEntry[] book) {
		  for(int i = 0; i < book.length -1; i++) {
			 int currentMin = book[i].getId(); 
			 int currentMinIndex = i;
			 for(int j = i + 1; j < book.length; j++) {
				 if(currentMin > book[j].getId()) {
					currentMin = book[j].getId();
					currentMinIndex = j;
				 }
			 }
			 if(currentMinIndex != i) {
				 book[currentMinIndex] = book[i];
				 book[i] = book[currentMin];
			 }
		  }
	  }
	  //Edit an entry (allows to edit any attributes (data fields) they want of a specific
	  //phone book entry of a given last name and firstname)
	  //return a 1 if the object was found and edited, returns 0 if the entry of the given
	  //userName and lastName do not exist.
	  public int Edit(String firstName, String lastName) {
		  Scanner input = new Scanner(System.in);
		  for(int i = 0; i < book.length; i++) {
			  if(book[i].getfirstName().equals(firstName) && book[i].getlastName().equals(lastName)) {
					System.out.println("1. ID");
					System.out.println("2. First name");
					System.out.println("3. Last name");
					System.out.println("4. Email");
					System.out.println("5. Zipcode");
					System.out.println("6. Phone Number");
					System.out.println("Enter number for what you want to edit");
					int ans = input.nextInt();
					
					if(ans == 1) {
						System.out.println("Enter new Id");
						int newID = input.nextInt();
						book[i].setId(newID);
					}else if(ans == 2){
						System.out.println("Enter new Firstname");
						String newFN = input.nextLine();
						book[i].setfirstName(newFN);
					}else if(ans == 3) {
						System.out.println("Enter new Lastname");
						String newLN = input.nextLine();
						book[i].setlastName(newLN);
					}else if(ans == 4) {
						System.out.println("Enter new email");
						String newEM = input.nextLine();
						book[i].setemail(newEM);
					}else if(ans == 5) {
						System.out.println("Enter new Zipcode");
						int newZP = input.nextInt();
						book[i].setzipcode(newZP);;
					}else if(ans == 6) {
						System.out.println("Enter new Phonenumber");
						long newPN = input.nextLong();
						book[i].setphoneNumber(newPN);
					}
					input.close();
					return 1;
			  }
				 
			  }
		  input.close();
		  return 0;
		  }
	  
		// Delete Entry of a given id, the method should return 1 if the entry is deleted
		// and 0 if not (not found). Deleting an entry from the array means you set all 
		// attributes of the entry’s object to be deleted to default values (feel free to define
		// your own default values – add comments about your default values) 
	  public int DeleteEntry(int id) {
		  for (int i=0;i< book.length;i++) {
		    	if (book[i].getId() == id) {
		    		book[i] = new PhoneBookEntry(-1, " ", " ", " ",0,0);
		    		return 1;
		    	}
		 }
		  return 0;
	  }
	  
	  public int DeleteEntry(String firstName, String lastName) {
		  for (int i=0;i< book.length;i++) {
		    	if (book[i].getfirstName().equals(firstName) && book[i].getlastName().equals(lastName)) {
		    		book[i] = new PhoneBookEntry(-1, " ", " ", " ",0,0);
		    		return 1;
		    	}
		 }
		  return 0;
	  }
} // end of class
