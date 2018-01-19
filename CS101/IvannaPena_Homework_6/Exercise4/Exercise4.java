public class Exercise4{
  public static void main(String[] args){
    //creates a stack
    StackofChars stack = new StackofChars();
    for(char i = 'A'; i < 'J'; i++){
      //push to stack
      stack.push(i);
    }
    while(!stack.empty()){
      //pops from stack
      System.out.println(stack.pop() + " ");
    }
  }
}
class StackofChars {
  private char[] elements;
  private int size;
  public static final int DEFAULT_CAPACITY = 10;
//stack with default capacity of 10
  public StackofChars(){
    this(DEFAULT_CAPACITY);
  }
//stack with the specified maximum capacity
  public StackofChars(int capacity){
    elements = new char[capacity];
  }
//push new char to top of the stack
  public void push(char letter){
    if(size >= elements.length){
      char[] temp = new char[elements.length * 2];
      //doubles the capacity
      System.arraycopy(elements, 0, temp,0, elements.length);
      elements = temp;
    }
    // add to stack
    elements[size++] = letter;
  }
  //return and remove the top element from the stack
  public char pop(){
    return elements[--size];
  }
// check whether stack is empty or not
  public boolean empty(){
    return size == 0;
  }
}
