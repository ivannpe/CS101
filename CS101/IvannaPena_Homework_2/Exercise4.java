import java.util.Scanner;

public class Exercise4{
  public static void main (String[] args) {
    // Define scanner
    Scanner input = new Scanner(System.in);
    //Ask for Farenheit
    System.out.print("Enter number of degrees in Fahrenheit> ");
    int f = input.nextInt();
    //Conversion formula
    int c = (5/9)*(f-32);
    System.out.println(f + " degrees Fahrenheit = " + c + " degrees Celsius");

  }
}
