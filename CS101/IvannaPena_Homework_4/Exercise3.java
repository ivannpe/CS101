//area of a circle
import java.util.Scanner;
public class Exercise3{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //asks for radius
    System.out.print("Enter the radius: ");
    double rad = input.nextDouble();
    //uses radius in area of circle method
    double area = areacirc(rad);
    System.out.println("The area of a circle with radius " + rad
      + " is " + area);
  }
//method to find area of the circle
  public static double areacirc(double x){
    double rad = x;
    double pi = 3.14;
    //equation for area
    double area = pi*rad*rad;
    return area;
  }
}
