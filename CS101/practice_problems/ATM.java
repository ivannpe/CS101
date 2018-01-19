package account info;
public class ATM{
  public static void main(String[] args){
    SavingAccount sa = new SavingAccount(1000);
    System.out.println("Account Name: " + sa.getName());
    System.out.println("Initial Amount: " + sa.getAmount());
    sa.deposit(5000);

    System.out.println("New Amount After Deposit: " + sa.getAmount());

    CheckingAccount ca = new CheckingAccount(20000);
    System.out.println("Account Name: " + ca.getName());
    System.out.println("Initial Amount: " + ca.getAmount());
    ca.deposit(5000);
    System.out.println("New Amount After Deposit: " + ca.getAmount());
    ca.withdraw(5000);
    System.out.println("New Amount After Deposit: " + ca.getAmount());
  }
}
