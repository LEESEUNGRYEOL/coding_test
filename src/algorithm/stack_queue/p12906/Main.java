package algorithm.stack_queue.p12906;


import java.util.List;
import java.util.Stack;

class Solution {
    public Stack<Integer> solution(int[] arr) {

        Stack<Integer> stack = new Stack<>();
        for (int a : arr) {
            if (stack.isEmpty()) {
                stack.push(a);
            } else {
                if (stack.peek() != a) {
                    stack.push(a);
                }
            }
        }

        return stack;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        Solution solution = new Solution();
        List<Integer> result = solution.solution(arr);
        System.out.println(result);
    }
}
