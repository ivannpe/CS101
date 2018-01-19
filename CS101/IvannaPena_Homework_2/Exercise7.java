import java.util.Scanner;
import java.text.*;

public class Exercise7{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Input:  Output:");
    String nums = input.nextLine();
    String[] grades = nums.split(" ");
    double avg = (Double.parseDouble(grades[0]) + Double.parseDouble(grades[1]) + Double.parseDouble(grades[2]))/3;
    DecimalFormat f = new DecimalFormat("#.##");
    System.out.println("Input:  Output: \n" + grades[0] + " " +  grades[1] + " " + grades[2] + "   " + f.format(avg));

  }
}
