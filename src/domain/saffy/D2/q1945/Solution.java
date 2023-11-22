package domain.saffy.D2.q1945;

import java.util.Scanner;

class Solution {


    public static void printResult(int testCase, int[] cntList) {
        System.out.print("#" + testCase + " ");
        for (int a : cntList) {
            System.out.print(a + " ");
        }
        System.out.println();
    }


    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int T;

        T = scanner.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int[] numList = {2, 3, 5, 7, 11};
            int[] cntList = new int[5];
            int n = scanner.nextInt();

            for (int i = 0; i < 5; i++) {
                while (n % numList[i] == 0) {
                    cntList[i]++;
                    n /= numList[i];
                }
            }

            printResult(test_case, cntList);
        }
    }
}