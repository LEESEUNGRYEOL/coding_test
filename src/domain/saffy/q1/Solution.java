package domain.saffy.q1;

import java.util.Scanner;

class Solution {
    public static void printResult(int testCode, int result) {
        System.out.println("#" + testCode + " " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int test_code = 1; test_code <= T; test_code++) {
            int n = scanner.nextInt();
            printResult(test_code, n * n);
        }


    }
}
