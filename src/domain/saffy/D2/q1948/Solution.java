package domain.saffy.D2.q1948;

import java.util.Scanner;

class Solution {

    static int[] x = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void printResult(int testCase, int result) {
        System.out.println("#" + testCase + " " + result);

    }


    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int T;

        T = scanner.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {

            int month1 = scanner.nextInt();
            int day1 = scanner.nextInt();
            int month2 = scanner.nextInt();
            int day2 = scanner.nextInt();

            if (month1 == month2) {
                printResult(test_case, day2 - day1 + 1);
                continue;
            }

            int result = 0;

            for (int i = month1 - 1; i <= month2 - 1; i++) {
                result += x[i];
            }
            result -= (x[month2 - 1] - day2) + day1 - 1;

            printResult(test_case, result);
        }
    }
}