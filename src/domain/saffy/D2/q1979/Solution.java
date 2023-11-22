package domain.saffy.D2.q1979;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {

    public static void printResult(int testCase, int result) {
        System.out.println("#" + testCase + " " + result);
    }

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int T;

        T = scanner.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            int[][] arr = new int[N][N];
            List<Integer> row = new ArrayList<>();
            List<Integer> column = new ArrayList<>();
            int result = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }

            // 1. 가로
            for (int i = 0; i < N; i++) {
                int cnt = 0;
                for (int j = 0; j < N; j++) {
                    if (arr[i][j] == 1) {
                        cnt++;
                    }
                    if (arr[i][j] == 0) {
                        row.add(cnt);
                        cnt = 0;
                    }
                    if (j == N - 1) {
                        row.add(cnt);
                        break;
                    }

                }
                for (int a : row) {
                    if (a == K) {
                        result++;
                    }
                }
                row.clear();
            }

            // 2. 세로
            for (int j = 0; j < N; j++) {
                int cnt = 0;
                for (int i = 0; i < N; i++) {
                    if (arr[i][j] == 1) {
                        cnt++;
                    }
                    if (arr[i][j] == 0) {
                        column.add(cnt);
                        cnt = 0;
                    }
                    if (i == N - 1) {
                        column.add(cnt);
                        break;
                    }
                }
                for (int a : column) {
                    if (a == K) {
                        result++;
                    }
                }
                column.clear();
            }

            printResult(test_case, result);
        }
    }
}