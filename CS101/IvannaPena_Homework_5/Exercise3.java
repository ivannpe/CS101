import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        //declares array of length 10
        double[] numbers = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 double numbers: ");
        // for loop to save values into array
        for (int i = 0; i < numbers.length; i++){
           numbers[i] = input.nextDouble();
         }
        //same name for overloading
        System.out.println("Average = " + average(numbers));

    }
// int method
    public static int average(int[] array) {
        int total = 0;
        //adds all values of the array
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        //returns average of the array
        return total / array.length;
    }
//double method
    public static double average(double[] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total / array.length;
    }
  }
