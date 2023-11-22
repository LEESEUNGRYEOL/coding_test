package domain.saffy.D2.q1966;

import java.util.Arrays;
import java.util.Scanner;

class Solution {

    public static void printResult(int testCase, int[] result) {
        System.out.print("#" + testCase + " ");
        for (int a : result) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int T;

        T = scanner.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = scanner.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            Arrays.sort(arr);

            printResult(test_case, arr);
        }
    }
}