import java.util.Scanner;
//for the Arrays.toString method
import java.util.Arrays;
public class Exercise1 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //Declare array of length 10
    int [] numbers = new int[10];
    int n = 10;
    System.out.println("Enter 10 numbers: ");
    //for loop to store the 10 numbers into the Arrays
    for(int i = 0; i < n; i++){
      numbers[i] = input.nextInt();
    }
    //for loop to swap items until midpoint is reached so new array is reversed
    for(int i = 0; i < numbers.length / 2; i++){
      int temp = numbers[i];
      numbers[i] = numbers[numbers.length - i - 1];
      numbers[numbers.length - i - 1] = temp;
    }
    //converts array to string so it can print out in array form
    System.out.println(Arrays.toString(numbers));
  }
}
