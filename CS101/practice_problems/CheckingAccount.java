package account info;
public class CheckingAccount extends Account{
  public CheckingAccount(long amount){
    super("Checking", amount);
  }
  public void withdraw(long amount){
    setAmount(getamount()-amount);
  }
}
