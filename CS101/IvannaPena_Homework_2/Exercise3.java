import java.util.Scanner;
import java.text.*;

public class Exercise3{
  public static void main (String[] args) {
    //define scanner
    Scanner input = new Scanner(System.in);
    // Ask for desired grade
    System.out.print("Enter desired grade> ");
    String g = input.next();
    // Ask for minimum average
    System.out.print("Enter minimum average required> ");
    double m = input.nextDouble();
    // Ask for current average
    System.out.print("Enter current average in course> ");
    double c = input.nextDouble();
    // Percentage it counts as
    System.out.print("Enter how much the final count as a percentage of the course grade" +
    "> ");
    double p = input.nextDouble()/100;

    // equation
    double z = ((m - (c * (1- p))) / p);
    //Truncate values
    DecimalFormat f = new DecimalFormat("#.#");

    System.out.println("You need a score of " + f.format(z) + " on the final to get a " + g);

  }
}
