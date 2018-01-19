public class PhoneBookEntry{
  //member variables
  private String Fname;
  private String Lname;
  private int PhoneNumber;
  //constructor
public PhoneBookEntry(){

}
public PhoneBookEntry(String F, int Number){
  this.Fname = F;
  this.PhoneNumber = Number;
}
public PhoneBookEntry(String F, String L, int N){
  this.Fname = F;
  this.Lname = L;
  this.PhoneNumber = N;
}
//getters and setters
  public void setFname(String F){
    this.Fname = F;
  }
  public String getFname(){
    return Fname;
  }
  public void setLname(String F){
    this.Lname = L;
  }
  public String getLname(){
    return Lname;
  }
  public void setPhoneNumber(int Number){
    this.PhoneNumber = Number;
  }
  public String getPhoneBookNumber(){
    return PhoneNumber;
  }
  public void PrintMyInfo(){
    System.out.println("First Name: " + Fname);
    System.out.println("Last Name: " + Lname);
    System.out.println("PhoneNumber: " + PhoneNumber);
  }

}
