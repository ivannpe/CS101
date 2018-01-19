import java.util.Scanner;
import java.text.*;

public class Exercise2 {
  public static void main (String[] args) {
    System.out.println("Convert Kilometers to Miles");
    //define scanner
    Scanner input = new Scanner(System.in);
    // Ask for kilometers
    System.out.print("Enter a number in kilometers: ");
    int k = input.nextInt();
    // Conversion
    double m = .6214;
    double x = (double)k * m;
    // Truncate decimal value
    DecimalFormat f = new DecimalFormat("#.###");
    System.out.println(k + " km is equal to " + f.format(x) + " miles.");

  }
}
