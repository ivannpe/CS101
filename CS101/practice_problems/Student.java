public class Student{
  public static void main(String[] args){
    Course course1 = new Course("Data Structures");
    Course course2 = new Course("Computer Systems Organization");
    course1.addStudent("John Doe", 307, "123121234");
    course2.addStudent("Maria Gonzalez", 307, "123121234");
    course1.addStudent("Chris Doe", 307, "123121234");
    course2.addStudent("Sally Gonzalez", 307, "123121234");
    course1.addStudent("Jordan Doe", 307, "123121234");
    course2.addStudent("Beth Gonzalez", 307, "123121234");
    System.out.println ("Number of students in Course 1: " + course1.getnumberOfStudents() + " Students are: ");
    String [] students = course1.getStudents();
    for (int i = 0; i < course1.getnumberOfStudents(); i++){
       System.out.println(students[i]);
     }
   System.out.println ();
   System.out.print("Number of students in Course 2: " + course2.getnumberOfStudents() + " Students are: ");
   String [] students1 = course2.getStudents();
   for (int i = 0; i < course2.getnumberOfStudents(); i++){
       System.out.println(students1[i]);
    }
  }
}
class Course{
  private String courseName;
  private String[] students = new String[10];
  private int numberOfStudents;
  private int id;
  private String ssn;
  public Course(String courseName){
    this.courseName = courseName;
  }
  public void addStudent(String student, int id, String ssn){
    students[numberOfStudents] = student;
    numberOfStudents++;
    id = id;
    ssn = ssn;
  }
  public String[] getStudents(){
    return students;
  }
  public int getnumberOfStudents(){
    return numberOfStudents;
  }
  public String getcourseName(){
    return courseName;
  }
  public int getID(){
    return id;
  }
  public void setID(int id){
    this.id = id;
  }
  public String getSSN(){
    return "XXX-XX-" + ssn.substring(4);
  }
  public void setSSN(String ssn){
    this.ssn = ssn;
  }
  public void dropStudent(String student) {
    int IndexOfStudentToDrop = -1;
    for (int i = 0; i < numberOfStudents; i++) {
        if (students[i].equalsIgnoreCase(student)) {
            IndexOfStudentToDrop = i;
            if (IndexOfStudentToDrop != -1) {
                for (i = IndexOfStudentToDrop; i < numberOfStudents; i++)
                    students[i] = students[i+1];
            }
            numberOfStudents--;
      }
    }
  }
}
// public class Student{
//   private String firstName;
//   private String lastName;
//   private int id;
//   private int ssn;
//   public Student(String fn, String ln, int id, int ssn){
//     firstName = fn;
//     lastName = ln;
//     id = id;
//     ssn = ssn;
//   }
//   public String getFirstName(){
//     return firstName;
//   }
//   public void setFirstName(String firstName){
//     this.firstName = firstName;
//   }
//   public String getLastName(){
//     return lastName;
//   }
//   public void setLastName(String lastName){
//     this.lastName = lastName;
//   }

//
// }
