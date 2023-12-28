package algorithm.자료구조.b10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            String s = bf.readLine();
            StringTokenizer st = new StringTokenizer(s);
            String op = st.nextToken();
            if (op.equals("push")) {
                int v = Integer.parseInt(st.nextToken());
                stack.push(v);
            } else if (op.equals("pop")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                    stack.pop();
                }
            } else if (op.equals("size")) {
                System.out.println(stack.size());
            } else if (op.equals("empty")) {
                if (stack.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (op.equals("top")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            }
        }
    }
}
