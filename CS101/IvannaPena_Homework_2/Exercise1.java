import java.util.Scanner;

public class Exercise1 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    // Ask for first number
    System.out.print("Enter a number x: ");
    int x = input.nextInt();
    // Ask for second number
    System.out.print("Enter a number y: ");
    int y = input.nextInt();
    int a = x + y;
    int s = x - y;
    int d = x / y;
    int m = x * y;
    int r = x % y;

    System.out.println(x + " + " + y + " = " + a);
    System.out.println(x + " - " + y + " = " + s);
    System.out.println(x + " / " + y + " = " + d);
    System.out.println(x + " * " + y + " = " + m);
    System.out.println(x + " % " + y + " = " + r);

  }
}
