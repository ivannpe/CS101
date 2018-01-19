import java.util.Scanner;
public class Exercise1 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //declares new matrix 3 X 4
    double[][] matrix = new double[3][4];
    System.out.print("Enter a 3x4 matrix (row by row): ");
    //for loop to enter values into the matrix
    for(int i = 0;i < matrix.length; i++){
      // goes through row by row
      for(int j = 0; j < matrix[i].length; j++){
        matrix[i][j] = input.nextDouble();
      }
    }
    // goes through each column and calls sum column method
    for(int k = 0; k < matrix[0].length; k++){
      System.out.println("Sum of the elements at Column " + k + " is " + sumColumn(matrix , k));
    }
  }
  //goes through each column and adds the values in that column index
  public static double sumColumn(double[][] m, int columnIndex){
    double sum = 0;

    for(int i = 0; i < m.length; i++){
      sum += m[i][columnIndex];
    }
    return sum;
  }
}
