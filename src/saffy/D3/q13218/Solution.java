package saffy.D3.q13218;

import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int T;

        T = scanner.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = scanner.nextInt();
            System.out.println("#" + test_case + " " + N / 3);
        }
    }
}