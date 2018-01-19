import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//A NormalUser should be able to do the following:
// Add a phone entry
// Edit a phone entry of a given first name and last name
// Sort the PhoneBookDirectory
// Search using Linear Search
// Print user’s info
// Define an interface for the NormalUser that will have the methods to be implemented by
//NormalUser. 

//DEFINE INTERFACE HERE
public interface NU{
	public int addEntry();
	public int Edit();
	public void sortEntries();
	public int LinearSearchByPhoneNumber();
	public void printUserInfo();
}
public class NormalUser extends User implements NU {
//	 NormalUser
//	has an id(int), username, password and PhoneBookDirectory 

	private int Id;	
	private String userName;
	private String passWord;
	protected PhoneBookDirectory pbd;
	
	Scanner input = new Scanner(System.in);
	public NormalUser(int id, String us, String pass, PhoneBookDirectory pbd) {
//	*used super, etc.*
	} 
	public int addEntry(){
		System.out.println("Enter ID: ");
	    int newid = input.nextLine();
	    System.out.println("Enter Username: ");
	    String newuser = input.nextLine();
	    System.out.println("Enter Password: ");
	    String newpass = input.nextLine();
	    System.out.println("Enter PhoneBookDirectory: ");
	    PhoneBookDirectory newpbd = input.nextLine();
			return NormalUserInfo.addEntry(newid, newuser, newpass, newpbd);
		
	}
	public int Edit(String firstName, String lastName) {
		  Scanner input = new Scanner(System.in);
		  for(int i = 0; i < book.length; i++) {
			  if(pbd[i].getfirstName().equals(firstName) && pbd[i].getlastName().equals(lastName)) {
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
						pbd[i].setId(newID);
					}else if(ans == 2){
						System.out.println("Enter new Username");
						String newFN = input.nextLine();
						pbd[i].setfirstName(newFN);
					}else if(ans == 3) {
						System.out.println("Enter new Password");
						String newLN = input.nextLine();
						pbd[i].setlastName(newLN);
					}
					input.close();
					return 1;
			  }
				 
			  }
		  input.close();
		  return 0;
		  }
	public static void sortEntries(PhoneBookEntry[] pbd) {
		  for(int i = 0; i < pbd.length -1; i++) {
			 int currentMin = pbd[i].getId(); 
			 int currentMinIndex = i;
			 for(int j = i + 1; j < pbd.length; j++) {
				 if(currentMin > pbd[j].getId()) {
					currentMin = pbd[j].getId();
					currentMinIndex = j;
				 }
			 }
			 if(currentMinIndex != i) {
				 pbd[currentMinIndex] = pbd[i];
				 pbd[i] = pbd[currentMin];
			 }
		  }
	  }
	public int LinearSearchByPhoneNumber(long phoneNumber) {
		  for(int i = 0; i < pbd.length; i++){
			  if(pbd[i].getphoneNumber() == phoneNumber) {
				  return 1;
			  }
		  }
		  return 0;
	  }
	public void printUserInfo() throws FileNotFoundException, IOException {

	    System.out.println("User Info:");
	    try (BufferedReader br = new BufferedReader(new FileReader("NormalUserInfo.txt"))) {
	    	   String line = null;
	    	   while ((line = br.readLine()) != null) {
	    	       System.out.println(line);
	    	   }
	    	}
	  }
}


