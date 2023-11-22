package domain.saffy.D2.q1970;

import java.util.Scanner;

class Solution {

    static int[] moneyList = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

    public static void printResult(int testCase, int[] result) {
        System.out.println("#" + testCase);
        for (int j : result) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int T;

        T = scanner.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int money = scanner.nextInt();
            int[] cntList = new int[8];
            for (int i = 0; i < moneyList.length; i++) {
                if (money >= moneyList[i]) {
                    cntList[i] += money / moneyList[i];
                    money %= moneyList[i];
                }
            }
            printResult(test_case, cntList);
        }
    }
}