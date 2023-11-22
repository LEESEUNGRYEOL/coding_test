package domain.saffy.D2.q2072;

import java.util.Scanner;

class Solution {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int T;

        T = scanner.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int[] arr = new int[10];
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                arr[i] = scanner.nextInt();
                if (arr[i] % 2 != 0) {
                    sum += arr[i];
                }
            }
            System.out.println("#" + test_case + " " + sum);
        }
    }
}