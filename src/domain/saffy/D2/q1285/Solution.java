package domain.saffy.D2.q1285;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Solution {
    public static void printResult(int testCase, int distance, int cnt) {
        System.out.println("#" + testCase + " " + distance + " " + cnt);
    }


    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int T;

        T = scanner.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int n = scanner.nextInt();
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int tmp = scanner.nextInt();
                if (tmp < 0) {
                    arr.add(-tmp);
                } else {
                    arr.add(tmp);
                }
            }
            Collections.sort(arr);
            int tmp = arr.get(0);
            int cnt = 0;
            for (int a : arr) {
                if (a == tmp) {
                    cnt++;
                } else {
                    break;
                }
            }
            printResult(test_case, tmp, cnt);
        }
    }
}
