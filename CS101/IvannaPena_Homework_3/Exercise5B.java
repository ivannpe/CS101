import java.util.Scanner;
import java.lang.*;
public class Exercise5B {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = input.nextInt();
    String binary = " ";
    while (num > 0) {
      int remainder = num % 2;
      binary = remainder + binary;
      num = num / 2;
      }
    System.out.println("In Binary: " + binary);
    }
  }
