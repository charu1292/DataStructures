package Stack;

import java.util.Stack;

public class ValidParanthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
            } else {
                if (stack.isEmpty()) {
                    return false;  // Closing bracket without a matching opening bracket
                }
                char top = stack.pop();
                if ((current == ')' && top != '(') ||
                        (current == '}' && top != '{') ||
                        (current == ']' && top != '[')) {
                    return false;  // Mismatched pair
                }
            }
        }
        return stack.isEmpty();  // True if no unmatched opening brackets are left
    }

    public static void main(String[] args) {
         String s="({})[]";
        System.out.println(isValid(s));
    }
}
