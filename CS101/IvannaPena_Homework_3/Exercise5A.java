import java.util.Scanner;
import java.lang.*;
public class Exercise5A {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = input.nextInt();
    System.out.println(num + " in Binary is: " + Integer.toBinaryString(num));
  }
}
