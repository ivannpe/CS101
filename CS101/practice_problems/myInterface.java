public interface myInterface{
  public String hello = "hello";
  public abstract void sayHello();
  public abstract void exam();
}

public class cs101 implements nyInterface{
  private String className = "CS101";
  public void sayHello() {
    System.out.println("Hi");
  }
  public void exam() {
    System.out.println("Exam on Thursday");
  }
  public Strinf getclassNAme(){
    return className;
  }
  public void setclassName(String classname){
    this.className = className;
  }
}

public class App {
  public static void main(String[] args){
    cs101 classNYU = new cs101();
    classNYU.exam();
    System.out.println(classNYU.hello);
  }
}
public class cs102 implements myInterface{
  public void sayHello() {
    System.out.println("Hi");
  }
  public void exam() {
    System.out.println("Exam on Thursday");
  }
}
