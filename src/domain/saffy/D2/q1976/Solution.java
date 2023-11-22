package domain.saffy.D2.q1976;

import java.util.Scanner;

class Solution {

    public static void printResult(int testCase, int sumHour, int sumMin) {
        System.out.println("#" + testCase + " " + sumHour +" " + sumMin);
    }

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int T;

        T = scanner.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int hour1 = scanner.nextInt();
            int min1 = scanner.nextInt();
            int hour2 = scanner.nextInt();
            int min2 = scanner.nextInt();

            int sumHour = hour1 + hour2;
            int sumMin = min1 + min2;

            if (sumHour > 12) {
                sumHour -= 12;
            }
            if (sumMin >= 60) {
                sumHour++;
                sumMin -= 60;
            }

            printResult(test_case, sumHour, sumMin);
        }
    }
}