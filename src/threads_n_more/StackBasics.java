package threads_n_more;


import java.util.Stack;

public class StackBasics {
//   stack.push(1); // adds an element to the top of  the stack and returns the element.
//
//    int top = stack.pop(); // removes top element from the stack and returns the element
//
//    int topElement = stack.peek(); // returns the top element from the stack and does not removes it
//
//    boolean isEmpty = stack.isEmpty(); // return true if stack is empty else false.

    public static void stack(Stack<Integer> ss) {

        while (!ss.isEmpty()) {
            int top = ss.pop();
            System.out.println(top);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> ss=new Stack<>();
        ss.push(2);
        ss.push(3);
        ss.push(5);
        ss.push(6);

        stack(ss);
    }
}
