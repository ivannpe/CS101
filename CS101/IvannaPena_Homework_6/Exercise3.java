import java.util.Scanner;
public class Exercise3 {
  // defines private array of states and capitals
  private static String[][] stateAndCapitals = {
    {"Alabama", "Montgomery"}, {"Alaska", "Juneau"},
    {"Arizona", "Phoenix"},{"Arkansas", "Little Rock"},
    {"California", "Sacramento"},{"Colorado", "Denver"},
    {"Connecticut", "Hartford"}, {"Delaware", "Dover"},
    {"Florida", "Tallahassee"}, {"Georgia", "Atlanta"},
    {"Hawaii", "Honolulu"}, {"Idaho", "Boise"},
		{"Illinois", "Springfield"}, {"Indiana", "Indianapolis"},
		{"Iowa", "Des Moines"}, {"Kansas", "Topeka"},
    {"Kentucky","Frankfort"},{"Louisiana", "Baton Rouge"},
    {"Maine", "Augusta"}, {"Maryland", "Annapolis"},
    {"Massachusetts", "Boston"}, {"Michigan", "Lansing"},
    {"Minnesota", "St. Paul"}, {"Mississippi", "Jackson"},
    {"Missouri", "Jefferson City"}, {"Montana", "Helena"},
    {"Nebraska", "Lincoln"}, {"Nevada", "Carson City"},
    {"New Hampshire", "Concord"}, {"New Jersey", "Trenton"},
    {"New Mexico", "Santa Fe"}, {"New York", "Albany"},
    {"North Carolina", "Raleigh"}, {"North Dakota", "Bismarck"},
    {"Ohio", "Columbus"},{"Oklahoma", "Oklahoma City"},
    {"Oregon", "Salem"}, {"Pennsylvania", "Harrisburg"},
    {"Rhode Island", "Providence"}, {"South Carolina", "Columbia"},
    {"South Dakota", "Pierre"}, {"Tennessee", "Nashville"},
    {"Texas", "Austin"}, {"Utah", "Salt Lake City"},
    {"Vermont", "Montpelier"}, {"Virginia", "Richmond"},
    {"Washington", "Olympia"},{"West Virginia", "Charleston"},
    {"Wisconsin", "Madison"}, {"Wyoming", "Cheyenne"}
  };
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //defines count variable for right answers
    int count = 0;
    // for the length of the array
    for(int i = 0; i < stateAndCapitals.length; i++){
      //prints the first value of the increasing elements in the array
      System.out.println("What is the capital of " + stateAndCapitals[i][0] +
       "?");
      String ans = input.nextLine();
      //checks if answer is equal (whether capitallized or not) to the
      // capital associated with the state in question
      if(ans.equalsIgnoreCase(stateAndCapitals[i][1])){
        System.out.println("Your answer is correct.");
      //adds to the count if the answer is correct
        count++;
      }else{
        System.out.println("The correct answer should be " +
        stateAndCapitals[i][1]);
      }

    }
    System.out.println("The correct count is " + count);
  }
}
