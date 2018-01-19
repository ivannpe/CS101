//even or odd
import java.util.Scanner;
public class Exercise4 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //asks for number
    System.out.print("Enter a number: ");
    int x = input.nextInt();
    //defines variable for the value of putting x into method
    int ans = evenOrOdd(x);
    // uses return value
    if(ans == 1){
      System.out.println("even");
    }else{
      System.out.println("odd");
    }

  }
  //method to tell if even or odd
  public static int evenOrOdd(int x){
    if(x % 2 == 0){
      return 1;
    }else{
      return 0;
    }
  }
}
