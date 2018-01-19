import java.util.Scanner;
public class exam_method_minmax{
  public static void main(String[] args){
    double [] grades = new double[5];
    Scanner input = new Scanner(System.in);

    for(int i = 0; i < grades.length; i++){
      System.out.println("Enter grades: ");
      grades[i] = input.nextDouble();
    }
    avg = averageArray(grades);
    for(int a = 0; i < grades.length; a++){
      System.out.println(grades[a]);
    }
    System.out.println("Average = " avg);
  }
  public static double averageArray(double[] input){
    double sum = 0;
    input[0] = 0;
    for(int j = 0; j < input.length; j++){
      sum += input[j];
    }
    sum /= input.length;
    return sum;
  }
}
