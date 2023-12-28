package algorithm.자료구조.b9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static String isVPS(String s) {
        String result = "NO";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        if (stack.isEmpty()) {
            result = "YES";
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int N = Integer.parseInt(s);

        for (int i = 0; i < N; i++) {
            System.out.println(isVPS(bf.readLine()));
        }
    }
}
