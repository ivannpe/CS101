import java.util.Scanner;
public class Exercise1{
  public static void main(String[] args){
    //define Scanner
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to your Bank");
    double balance = 0.00;
    // Start while loop so it continues until user chooses to exit
    while(true){
      //main menu
      System.out.println("1. View your account balance\n" +
      "2. Deposit Cash\n3. Withdraw Cash\n4. Exit");
      System.out.print("Choose an Option(1-4): ");
      int option = input.nextInt();
      if(option == 1){
        System.out.println("Your Current Balance is $" + balance);
      }else if(option == 2){
        System.out.print("Enter Deposit amount: $");
        Double deposit = input.nextDouble();
        //Check that value is positive
        if(deposit < 0){
          System.out.println("Can not Deposit Negative Value. Try Again");
        }else{
            balance = balance + deposit;
        }
      }else if(option == 3){
        System.out.print("Enter Withdrawal amount: $");
        double withdraw = input.nextDouble();
        // check for if balance is greater than withdrawal amount
        if(balance < withdraw){
          System.out.println("Unsufficient Funds. You only have $" + balance + " in your account.");
        }else{
          balance = balance - withdraw;
        }
      }else{
        break;
      }
    }

  }
}
