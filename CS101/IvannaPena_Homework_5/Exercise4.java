import java.util.Scanner;
public class Exercise4{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int [] numbers = new int[10];
    int n = 10;
    System.out.println("Enter numbers: ");
    //for loop to store the 10 numbers into the Arrays
    for(int i = 0; i < n; i++){
      numbers[i] = input.nextInt();
    }
    //saves answer into boolean
    Boolean a = isSorted(numbers);
    //if statement to print out whether list is sorted or not
    if(a.equals(true)){
      System.out.println("The List is sorted");

    }else{
      System.out.println("The List is not sorted");
    }
  }
  //method to go through list
    public static boolean isSorted(int[] a) {
      for (int i = 0; i < a.length - 1; i++) {
        // if the value before the next is greater than the one after it is not sorted
          if (a[i] > a[i + 1]) {
              return false;
          }
      }

      return true;
    }
}
