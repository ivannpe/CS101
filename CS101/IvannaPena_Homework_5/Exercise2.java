import java.util.Scanner;
public class Exercise2{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      char [] num = new char[126];
      char [] count = new char[126;
      //temp will hold value of index of array
      int i,temp = 0;
      System.out.println("Enter the integers between 1 and 100: ");

      //starts array based on user input
      for(i=0; i < num.length; i++){
          num[i] = input.nextInt();
          //program ends when it sees 0
          if(num[i] == 0){
              break;
          }
      }
      //temp variable is index value
      //keeps track of number of occurences of each number
      for(i = 0; i < num.length; i++){
              temp = num[i];
              count[temp]++;
          }
          // for loop to check amount of instances
      for(i=1; i < count.length; i++){

          if(count[i] > 0 && count[i] == 1){
           System.out.printf("%d occurs %d time\n",i, count[i]);
           }
          else if(count[i] >=2){
              System.out.printf("%d occurs %d times\n",i, count[i]);
          }


       }
  }
}
