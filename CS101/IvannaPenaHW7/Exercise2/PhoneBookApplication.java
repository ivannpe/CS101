import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//PhoneBookApplication class (the one that will have the main method)
// Initially, You should create an object of type PhoneBookAdmin and another one of type
//NormalUser.
// PhoneBookAdmin’s object should have a username, password and email address. They
//should read from a file. Username, password and email address are separated by comma.
// NormalUser’s object initially has an id, username, password. They should be read from a
//file (separated by comma).
// Then you ask the user to login and you will need to check if the user is an admin or a
//normal user, then you display the menu accordingly. 
public class PhoneBookApplication {

	public static void main(String[] args) {
		String fileName = "AdminUserInfo.txt";
		String line = null;
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while((line = bufferedReader.readLine())!=null)
			{
				System.out.println(line);		
			}		
			bufferedReader.close();
		}
		catch(FileNotFoundException ex){		
			System.out.println("file not found");
		}
		catch(IOException ex)
		{	
			System.out.println("IO Exception");
			ex.printStackTrace();	
		}
        	//PhoneBookAdmin’s object should have a username, password and email address. They
		//should read from a file. Username, password and email address are separated by comma
		PhoneBookAdmin Admin = new PhoneBookAdmin();
		File file = new File("AdminUserInfo.txt");
	    Scanner scan = null;
	    try {
	        scan = new Scanner(file);

	        while (scan.hasNextLine()) {
	            String line = scan.nextLine();
	            String[] lineArray = line.split(",");
	            PhoneBookAdmin Admin = new PhoneBookAdmin(lineArray);
	    }} catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } finally {
	        scan.close();
	    }
	
		//NormalUser’s object initially has an id, username, password. They should be read from a
		//file (separated by comma). 
		NormalUser User = new NormalUser();
		File file1 = new File("NormalUserInfo.txt");

	    try {
	        scan = new Scanner(file1);

	        while (scan.hasNextLine()) {
	            String line1 = scan.nextLine();
	            String[] lineArray1 = line1.split(",");
	            NormalUser User = new NormalUser(lineArray1);
	    }} catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } finally {
	        scan.close();
	    }
	
		
		//Then you ask the user to login and you will need to check if the user is an admin or a
		//normal user, then you display the menu accordingly. 		
	}

}
