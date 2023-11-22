package domain.saffy.D2.q1986;

import java.util.Scanner;

class Solution {

    public static void printResult(int testCase, int sum) {
        System.out.println("#" + testCase + " " + sum);
    }

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int T;

        T = scanner.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int n = scanner.nextInt();
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    sum -= i;
                } else {
                    sum += i;
                }
            }

            printResult(test_case, sum);
        }
    }
}