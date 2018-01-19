import java.util.Scanner;
public class exam_grades{
  public static void main(String[] args){
    double [] grades = new double[5];
    Scanner input = new Scanner(System.in);

    for(int i = 0; i < grades.length; i++){
      System.out.println("Enter grades: ");
      grades[i] = input.nextDouble();
    }
    for(int j = 0; j < grades.length; j++){
      sum += grades[j];
    }
    System.out.println("The average of the grades is: " + (double) (sum/grades.length));
  }
}
