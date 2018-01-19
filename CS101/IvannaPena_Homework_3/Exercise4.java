import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Exercise4 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first String: ");
    String one = input.nextLine();
    System.out.print("Enter the second String: ");
    String two = input.nextLine();
    //creates a list of the separated words in the string
    List<String> wordsintwo = Arrays.asList(two.split(" "));
    // separates the words in the first string
    for(String prefix : one.split(" ")) {
      // checks if the words separated in the first string are also in the second string
      if(wordsintwo.contains(prefix)){
        System.out.println( "The Common Prefix is " + prefix);
      }else{
        System.out.println(one + " and " + two + " have no common prefixes");
      }
    }
  }
}
