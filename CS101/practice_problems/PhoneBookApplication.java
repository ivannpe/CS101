import java.util.*;
public class PhoneBookApplication{
  public static void main(String[] args){
    //PhoneBookApplication - add, delete, search, edit
    Scanner S = new Scanner(System.in);

    int numbers[] = new int[5];
    PhoneBookEntry[] contacts = new PhoneBookEntry[4];
    for(int i = 0;i < contacts.length; i++){
      System.out.println("Entry Number " + (i+1));
      System.out.println("First Name: ");
      String Fn = S.next();
      System.out.println("Last Name: ");
      String Ln = S.next();
      System.out.println("Number: ");
      int p = S.nextInt();
      contacts[i] = new PhoneBookEntry(Fn,Ln,p);
    }
    //Search: Ask user for first name and print if its in contacts or not
    System.out.println("Enter a name");
    String name = S.next();
    int status = 0;
    for(int j = 0, j < contacts.length; j++){
      if(name.equals(contacts[j].getFname())){
        contacts[j].PrintMyInfo();
        status = 1;
      }
    }
    if(status == 0){
      System.out.println("Not in contacts.");
    }
    // edit
    System.out.println("Name to edit?: ");
    String editableName = S.next();
    for(int x = 0; x< contacts.length; x++){
      if(editableName.equals(contacts[x].getFname())){
        System.out.println("New number?: ");
        contacts[x].setPhoneNumber(S.nextInt());
        contacts[x].PrintMyInfo();
      }
    }
  //
  //   PhoneBookEntry EntryOne = new PhoneBookEntry(Fn,Ln,p);
  //   //Class ObjectName = new Constructor(Parameter);
  //   PhoneBookEntry EntryTwo = new PhoneBookEntry();
  //   PhoneBookEntry EntryThree = new PhoneBookEntry(Fn,p);
  //   //Print EntryOne Lastname
  //   System.out.println("First Name of One: " + EntryOne.getFname());
  //   // Change name of One
  //   System.out.println("Enter New Name of One: ");
  //   String n = S.next();
  //   EntryOne.setFname(n);
  //   System.out.println("-----ONE-----");
  //   EntryOne.PrintMyInfo();
  //   System.out.println("-----TWO-----");
  //   EntryTwo.PrintMyInfo();
  //   System.out.println("-----THREE-----");
  //   EntryThree.PrintMyInfo();
  // }
}
