public class Exercise3 {
  public static void main(String[] args){
    char letter = 'A';
    // Starts loop to convert to ascii
    for(int ascii = (int)letter; ascii <= 126; ascii++){
      //loop for 5 characters per line
      for(int i = 0; i < 5; i++){
        System.out.print(letter + "," + ascii);
        System.out.print("  ");
        ascii++;
        letter++;
      }
      System.out.println(" ");
    }
  }
}
