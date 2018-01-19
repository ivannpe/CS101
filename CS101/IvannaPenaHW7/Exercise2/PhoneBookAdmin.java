import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//A PhoneBookAdmin should be able to do the following:
// Add a phone entry
// Edit a phone entry of a given first name and last name
// Delete a phone entry of a given first name and last name
// Sort the PhoneBookDirectory
// Search using Linear Search
// Search using Binary Search
// Print Admin’s info
// Change Password
// Change Username 
//Define an interface for PhoneBookAdmin that will have the methods to be implemented by

public interface PBA{
	public int addEntry();
	public int Edit();
	public int DeleteEntry();
	public void sortEntries();
	public int LinearSearchByPhoneNumber();
	public PhoneBookEntry SearchbyIdBinarySearch();
	public void printAdminInfo();
	public void changePassword();
	public void changeUsername();
}

public class PhoneBookAdmin extends User implements PBA {
//	PhoneBookAdmin
//	has a username, password, emailAddress (string) and a PhoneBookDirectory
	private String userName;
	private String passWord;
	private String emailAddress;
	protected PhoneBookDirectory pbd;

	Scanner input = new Scanner(System.in);
	public PhoneBookAdmin(String us, String pass, String ea, PhoneBookDirectory pbd) {
//	*used super, etc.*
	} 
	public int addEntry(){
		System.out.println("Enter Username: ");
	    String newuser = input.nextLine();
	    System.out.println("Enter Password: ");
	    String newpass = input.nextLine();
	    System.out.println("Enter email: ");
	    String newemail = input.nextLine();
	    System.out.println("Enter PhoneBookDirectory: ");
	    PhoneBookDirectory newpbd = input.nextLine();
			return AdminUserInfo.addEntry(newuser, newpass, newemail, newpbd);
		}
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
	public int DeleteEntry() {

      System.out.println("Enter Firstname and Lastname of entry to delete (separated with spaces): ");
      String deletefn = input.next();
      String deleteln = input.next();

      return AdminUserInfo.DeleteEntry(deletefn, deleteln);
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
	 public PhoneBookEntry SearchbyIdBinarySearch(int id) {
		  sortEntries(pbd);
		  int low = 0;
		  int high = pbd.length - 1;
		  while(high >= low) {
			  int mid = (low + high) / 2;
			  if(id < pbd[mid].getId()) {
				high = mid -1;  
			  }else if(id == pbd[mid].getId()) {
				return new PhoneBookEntry(pbd[mid].getId(), pbd[mid].getfirstName(), pbd[mid].getlastName(), pbd[mid].getemail(), pbd[mid].getzipcode(), pbd[mid].getphoneNumber());
			  }else {
				low = mid + 1;
			  }	  
		  }
		  return new PhoneBookEntry();
	 }
	 public void printAdminInfo() throws IOException {

		    System.out.println("Admin Info:");
		    try (BufferedReader br = new BufferedReader(new FileReader("AdminUserInfo.txt"))) {
		    	   String line = null;
		    	   while ((line = br.readLine()) != null) {
		    	       System.out.println(line);
		    	   }
		    	}
		  }
	 public void changePassword(String pass) {
		 try{
	            String verify, putData;
	            File file = new File("AdminUserInfo.txt");
	            file.createNewFile();
	            FileWriter fw = new FileWriter(file);
	            BufferedWriter bw = new BufferedWriter(fw);
	            bw.write("username");
	            bw.flush();
	            bw.close();
	            FileReader fr = new FileReader(file);
	            BufferedReader br = new BufferedReader(fr);

	            while( (verify=br.readLine()) != null ){ 
	                if(verify != null){
	                    putData = verify.replaceAll(pass, null);
	                    bw.write(putData);
	                }
	            }
	            br.close();


	        }catch(IOException e){
	        e.printStackTrace();
	        }
	    }
	 
	 
	 public void changeUsername(String user) {
		 try{
	            String verify, putData;
	            File file = new File("AdminUserInfo.txt");
	            file.createNewFile();
	            FileWriter fw = new FileWriter(file);
	            BufferedWriter bw = new BufferedWriter(fw);
	            bw.write("username");
	            bw.flush();
	            bw.close();
	            FileReader fr = new FileReader(file);
	            BufferedReader br = new BufferedReader(fr);

	            while( (verify=br.readLine()) != null ){ 
	                if(verify != null){
	                    putData = verify.replaceAll(user, null);
	                    bw.write(putData);
	                }
	            }
	            br.close();


	        }catch(IOException e){
	        e.printStackTrace();
	        }
	 }
}
