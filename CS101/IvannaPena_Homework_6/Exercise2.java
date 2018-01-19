import java.util.Scanner;
public class Exercise2 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //declares a 4x4 matrix
    double[][] matrix = new double[4][4];
    //for loop to enter values into the matrix
    System.out.print("Enter 4x4 matrix (row by row): ");
    for(int i = 0; i < matrix.length; i++){
      // goes through row by row
      for(int j = 0; j < matrix.length; j++){
        matrix[i][j] = input.nextDouble();
      }
    }
    // calls the method sumMajorDiagonal
    System.out.println("Sum of the elements in the major diagonal is " +
     sumMajorDiagonal(matrix));
  }
//method that adds the values in the major diagonal
  public static double sumMajorDiagonal(double[][]m){
    double sum = 0;
    for(int i = 0; i < m.length; i++){
      for(int j = 0; j < m[i].length; j++){
          //if the column index and row index are the same then it is the diagonal value
        if(i == j){
          sum += m[i][j];
        }
      }
    }
    return sum;
  }
}
