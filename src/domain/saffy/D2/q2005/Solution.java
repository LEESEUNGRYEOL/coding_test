package domain.saffy.D2.q2005;

import java.util.Scanner;

class Solution {

    public static void printResult(int testCase, int[][] arr) {
        System.out.println("#" + testCase);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int T;

        T = scanner.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = scanner.nextInt();
            int[][] arr = new int[n][n];

            arr[0][0] = 1;
            for (int i = 1; i < n; i++) {
                arr[i][0] = 1;
                for (int j = 1; j <= i; j++) {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
                arr[i][i] = 1;
            }
            printResult(test_case,arr);
        }
    }
}