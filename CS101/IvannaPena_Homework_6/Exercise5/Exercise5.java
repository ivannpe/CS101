import java.util.Scanner;
//Write a test program that creates an Account object with an account ID of 1122, a balance of $20,000
// and an annual interest of 4.5%. Use the withdraw method to withdraw $2,500, use the deposit method
// to deposit $3,000, and print the balance, the monthly interest and the date with this account was
// created.
public class Exercise5 {
  public static void main(String[] args){
    Account acct = new Account(1122, 20000);
       acct.setAnnualInterestRate(4.5);
       acct.withdraw(2500.0);
       acct.deposit(3000.0);
       System.out.println("Balance: " + acct.getBalance());
       System.out.println("Monthly Interest: " + acct.getMonthlyInterest());
       System.out.println("Date Account Created: " + acct.getDateCreated());
  }
}
class Account {
// 1. A private int data field named id for the account (default value 0)
    private int id = 0;
// 2. A private double data field named balance for the account (default value 0)
    private double balance = 0.0;
// 3. A private double data field named annualInterstRate that stores the current interest rate
    private static double annualInterestRate = 0.0;
// 4. A private Date data field named dateCreated that stores the date when the account was created.
    private java.util.Date dateCreated;
// 5. A default constructor that creates the default account.
    public Account() {
        dateCreated = new java.util.Date();
    }
// 6. A constructor that that creates an account with the specified id and initial balance.
    public Account(int id, double balance) {
        this();
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
// 8. The accessor method for dateCreated
    public String getDateCreated() {
        return this.dateCreated.toString();
    }

// 9. A method named getMonthlyInterset() that returns the monthly interest
    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 ;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
// 10. A method named withdraw that withdraws a specified amount from the account.
    public void withdraw(double amount) {
        this.balance -= amount;
    }
// 11. A method named deposit that deposits a specified amount to the account.
    public void deposit(double amount) {
        this.balance += amount;
    }
}
