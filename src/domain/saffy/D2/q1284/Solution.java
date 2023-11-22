package domain.saffy.D2.q1284;

import java.util.Scanner;

class Solution {
    public static void printResult(int testCase, int cnt) {
        System.out.println("#" + testCase + " " + cnt);
    }


    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int T;

        T = scanner.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int P = scanner.nextInt();
            int Q = scanner.nextInt();
            int R = scanner.nextInt();
            int S = scanner.nextInt();
            int W = scanner.nextInt();
            int bBills = 0;

            int aBills = W * P;
            if (W <= R) {
                bBills = Q;
            } else {
                bBills = Q + (W - R) * S;
            }
            int result = Math.min(aBills, bBills);

            printResult(test_case, result);
        }
    }
}
