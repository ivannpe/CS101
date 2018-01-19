import java.util.Scanner;

public class Exercise5{
  public static void main (String[] args) {
    String p = "NYU1256";
    // Define Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Password: ");
    String i = input.next();
    if(p.equals(i)){
      System.out.println("Valid Password");
    }else {
      System.out.println("Invalid Password");
    }

  }
}
