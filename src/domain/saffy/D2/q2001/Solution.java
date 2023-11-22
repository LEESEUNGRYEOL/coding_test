package domain.saffy.D2.q2001;

import java.util.Scanner;

class Solution {


    public static int findBox(int[][] arr, int i, int j, int M) {
        int sum = 0;
        for (int k = i; k < i + M; k++) {
            for (int l = j; l < j + M; l++) {
                sum += arr[k][l];
            }
        }
        return sum;
    }

    public static int findMax(int[][] arr, int M) {
        int result = 0;
        int sum;

        for (int i = 0; i < arr.length - (M - 1); i++) {
            for (int j = 0; j < arr[i].length - (M - 1); j++) {
                sum = findBox(arr, i, j, M);
                if (sum > result) {
                    result = sum;
                }
            }
        }

        return result;
    }

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int T;

        T = scanner.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int[][] arr = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }
            System.out.println("#" + test_case + " " + findMax(arr, M));
        }
    }
}