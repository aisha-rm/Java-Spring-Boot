import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<String>();

        myStack.add("Mustapha");
        myStack.push("Muhammad");  //push preferred as standard
        myStack.add("Husband");
        myStack.push("For life");

        System.out.println(myStack);
        System.out.println(myStack.peek());
        

    }
    
}
