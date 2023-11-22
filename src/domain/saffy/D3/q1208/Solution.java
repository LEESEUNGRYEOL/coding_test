package domain.saffy.D3.q1208;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void printResult(int testCode, int cnt) {
        System.out.println("#" + testCode + " " + cnt);
    }

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);

        for (int test_case = 1; test_case <= 10; test_case++) {
            int N = scanner.nextInt();
            int[] dump = new int[100];
            for (int i = 0; i < 100; i++) {
                dump[i] = scanner.nextInt();
            }
            Arrays.sort(dump);
            for (int i = 0; i < N; i++) {
                dump[0]++;
                dump[99]--;
                Arrays.sort(dump);
            }
            printResult(test_case, dump[99] - dump[0]);
        }

    }
}