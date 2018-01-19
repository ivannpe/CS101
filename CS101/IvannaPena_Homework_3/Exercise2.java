import java.util.Scanner;
// to raise to a power
import java.lang.Math;
//to format the converted double
import java.text.*;

public class Exercise2 {
  public static void main(String[] args){
    //define scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an Integer: ");
    int num = input.nextInt();
    System.out.print("What power do you want " + num + " to be raised to? ");
    int power = input.nextInt();
    // raising number to that power
    Double answer =  Math.pow(num, power);
    DecimalFormat f = new DecimalFormat("#");
    //loop to print the i x i...
    for(int i = 0; i < power - 1; i++){
      System.out.print(num + " x ");
    }
    // Print last number and answer
    System.out.println(num + " = " + f.format(answer));
  }
}
