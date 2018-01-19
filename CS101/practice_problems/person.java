public abstract class Person{
  private String name;
  private String gender;

  public Person(String nm, String gen){
    this.name = nm;
    this.gender = gen;
  }

  public abstract void work();

  @Override //from the object class
  public String toString(){
    return "Name=" + this.name + ": : Gender" + this.gender;
  }
  public void changeName(String newName)
}

public class Employee extends Person{
  private int empID;
  public Employee(String nm, String gen, int id){
    super(nm,gen);
    this.empID = id;
  }
  public void work(){
    if(empID == 0){
      System.out.println("NOT WORKING");
    }else{
      System.out.println("WORKING AS EMPLOYEE");
    }
  }
}
public class App{
  public static void main(String[] args){
    Person student = new Employee("Dove", "Female",0);
    Person employee = new Employee("Dave", "Male",12);
    student.work();
    employee.work();
    employee.changeName();
  }
}
