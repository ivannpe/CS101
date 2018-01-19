import java.util.Scanner;

public class Exercise1{
  public static void main(String[] args) {
    //defining variables
      int count = 0, menuOption = 0;
      double deposit = 0, withdraw = 0, currentBal=0;
      Scanner input = new Scanner(System.in);
      //quits if the user chooses to exit
      while (menuOption != 4)
      {
          menuOption = menu();
          // Switch case to choose option
          switch (menuOption){
          case 1:
              showbalance(currentBal);
              break;
          case 2:
              System.out.print("Enter Amount You Wish to Deposit: $ ");
              deposit = input.nextDouble();
              // makes sure value isnt negative
              if(deposit < 0){
                System.out.println("Can not Deposit Negative Value. Try Again");
              }else{
                  currentBal = depositcash(deposit, currentBal);
              }
              break;
          case 3:
              System.out.print("Enter Withdrawal amount: $");
              withdraw = input.nextDouble();

              while(withdraw >currentBal){
                  System.out.println("Insufficient Funds. Try Again");
                  System.out.print("Enter Withdrawal amount: $");
                  withdraw = input.nextDouble();
              }

              currentBal = withdraw(currentBal, withdraw);
              break;
          case 4:
              System.exit(0);
              break;
          }
      }
  }
  //displays the menu
    public static int menu(){
        Scanner input = new Scanner(System.in);
        int menuOption;
        System.out.println("1. View your account balance\n" +
        "2. Deposit Cash\n3. Withdraw Cash\n4. Exit");
        System.out.print("Choose an Option(1-4): ");
        menuOption = input.nextInt();
        return menuOption;
    }
//shows the balance
    public static void showbalance(double x){
        System.out.println("Your Current Balance is $ " +  x);
    }
// changes the balance through deposit option
    public static double depositcash(double x, double y){
        double deposit = y, currentBal = x;
        double newBalance = deposit + currentBal;

        System.out.println("Your New Balance is $ " +  newBalance);

        return newBalance;
    }
//new balance through withdrawing
    public static double withdraw(double x, double y){
        double withdraw = y, currentBal = x, newBalance;

        newBalance = currentBal - withdraw;
        System.out.printf("Your New Balance is $ " + newBalance);

        return newBalance;
    }
}
