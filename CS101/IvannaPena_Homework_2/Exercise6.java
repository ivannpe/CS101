import java.util.Scanner;
import java.lang.Math;

public class Exercise6{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int a = input.nextInt();
    System.out.print("Enter another number: ");
    int b = input.nextInt();
    System.out.println("The maximum of " + a + " & " + b + " is " + Math.max(a,b));

  }
}
