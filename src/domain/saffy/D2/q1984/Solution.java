package domain.saffy.D2.q1984;

import java.util.Scanner;

class Solution {

    static String[] arr = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};

    public static void printResult(int testCase, int result, int N) {
        result /= ((double) N / 10);
        System.out.println("#" + testCase + " " + arr[result]);
    }

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int T;

        T = scanner.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            double[] sumList = new double[N];

            for (int i = 0; i < N; i++) {
                int midterm = scanner.nextInt();
                int finals = scanner.nextInt();
                int assignments = scanner.nextInt();
                double sum = midterm * 0.35 + finals * 0.45 + assignments * 0.2;
                sumList[i] = sum;
            }

            double tmp = sumList[M - 1];
            int result = 0;
            for (int i = 0; i < sumList.length; i++) {
                if (tmp < sumList[i]) {
                    result++;
                }
            }
            printResult(test_case, result, N);
        }
    }
}