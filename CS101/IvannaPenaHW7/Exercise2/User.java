import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Add a phone entry
// Edit a phone entry of a given first name and last name
// Delete a phone entry of a given first name and last name
// Sort the PhoneBookDirectory
// Search using Linear Search
// Search using Binary Search
// Print Admin’s info
// Print user’s info
// Change Password
// Change Username
public class User {
	 private PhoneBookEntry[] book;
	 private int count;

	  // Creates an empty PhoneBook object.
	  public User() {
	    book = new PhoneBookEntry[6];
	    count = 0;
	  }

	  // Returns true if the current object is full.
	  public boolean full() {
	    return (count == 6);
	  }
	public int addEntry(PhoneBookEntry entry) {
	    if(full()) {
	    	return 0;
	    }
	    
	    book[count] = new PhoneBookEntry(entry.getId(),entry.getfirstName(), entry.getlastName(), entry.getemail(), entry.getzipcode(), entry.getphoneNumber());
	    count++;
	    return 1;
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
	 public int DeleteEntry(String firstName, String lastName) {
		  for (int i=0;i< book.length;i++) {
		    	if (book[i].getfirstName().equals(firstName) && book[i].getlastName().equals(lastName)) {
		    		book[i] = new PhoneBookEntry(-1, " ", " ", " ",0,0);
		    		return 1;
		    	}
		 }
		  return 0;
	  }
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
	 public int LinearSearchByPhoneNumber(long phoneNumber) {
		  for(int i = 0; i < book.length; i++){
			  if(book[i].getphoneNumber() == phoneNumber) {
				  return 1;
			  }
		  }
		  return 0;
	  }
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
	 public void printAdminInfo() throws IOException {

		    System.out.println("Admin Info:");
		    try (BufferedReader br = new BufferedReader(new FileReader("AdminUserInfo.txt"))) {
		    	   String line = null;
		    	   while ((line = br.readLine()) != null) {
		    	       System.out.println(line);
		    	   }
		    	}
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
