// last digit of product of two numbers
import java.util.Scanner;
public class Exercise2{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //asks for integers
    System.out.print("Enter an Integer : ");
    int one = input.nextInt();
    System.out.print("Enter an Integer : ");
    int two = input.nextInt();
    //calls product method and assigns it to answer
    int answer = product(one,two);
    //uses answer as integer used in finding the last digit
    int last = lastDigit(answer);
    System.out.println("The product of integer one and two is " + answer);
    System.out.println("The last digit of the product is " + last);



  }
// method to find the product of two numbers
public static int product(int x, int y){
  int one = x;
  int two = y;
  int newProduct = x*y;
  return newProduct;
}
//method to find the last digit
public static int lastDigit(int x){
  int answer = x;
  // gets last digit
  int digit = x % 10;
  return digit;
  }
}
