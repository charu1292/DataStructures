package Leet_code;
//https://leetcode.com/problems/daily-temperatures/
import java.util.Stack;

public class temperature_problem {
    public static int[] Temperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] results = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int index = stack.pop();
                results[index] = i - index;
            }
            stack.push(i);
        }

        return results;
    }
    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] results = Temperatures(temperatures);
        for (int res : results) {
            System.out.print(res + " ");
        }
    }
}
