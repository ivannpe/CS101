//multiples
import java.util.Scanner;
public class Exercise5 {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      //asks for integers
      System.out.print("Enter first integer:");
      int one = input.nextInt();
      System.out.print("Enter second integer:");
      int two = input.nextInt();
      //declares variable for the output of method
      int ans = multiple(one,two);
      //prints answer depending on return value
      if(ans == 1){
        System.out.println(two +" is a multiple of first integer");
      }else{
        System.out.println("Not a multiple");
      }
}
//method tells if second number is a multiple of the first
public static int multiple(int x, int y){
      int one = x;
      int two = y;
      //remainder 0 for multiple
      if (two%one == 0){
        return 1;
      }else{
        return 0;
    }
  }
 }
