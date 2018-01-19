package account info;
public class Account {
  private String name;
  private long amount;
  public Account(String name, long amount){
    this.name = name;
    setAmount(amount);
  }
  public Account(){

  }
  public void deposit(long amount){
    this.amount += amount;
  }
  public void setName(String S){
    this.name = S;
  }
  public String getName(){
    return name;
  }
  publiv long getAmount(){
    return amount;
  }
  public void setAmount(long amount){
    this.amount = amount;
  }
}
