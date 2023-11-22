package domain.saffy.D2.q1989;

import java.util.Scanner;

class Solution {

    public static void printResult(int testCase, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("#" + testCase + " " + 1);
            return;
        }
        System.out.println("#" + testCase + " " + 0);
    }

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int T;

        T = scanner.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            String str = scanner.next();
            boolean isPalindrome = true;
            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }
            printResult(test_case, isPalindrome);
        }
    }
}