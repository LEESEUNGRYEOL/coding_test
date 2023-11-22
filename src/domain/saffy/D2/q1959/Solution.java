package domain.saffy.D2.q1959;

import java.util.Arrays;
import java.util.Scanner;

class Solution {

    public static void printResult(int testCase, int result) {
        System.out.println("#" + testCase + " " + result);
    }

    public static int makeLargeNum(int[] aList, int[] bList) {
        int[] sumList = new int[bList.length - aList.length + 1];
        for (int i = 0; i <= bList.length - aList.length; i++) {
            for (int k = 0; k < aList.length; k++) {
                sumList[i] += aList[k] * bList[k + i];
            }
        }
        Arrays.sort(sumList);
        return sumList[bList.length - aList.length];
    }

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int T;
        int result = 0;
        T = scanner.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int[] aList = new int[a];
            int[] bList = new int[b];
            for (int i = 0; i < a; i++) {
                aList[i] = scanner.nextInt();
            }
            for (int i = 0; i < b; i++) {
                bList[i] = scanner.nextInt();
            }
            if (aList.length > bList.length) {
                result = makeLargeNum(bList, aList);
            } else {
                result = makeLargeNum(aList, bList);
            }
            printResult(test_case, result);
        }
    }
}