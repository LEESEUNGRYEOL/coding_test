package domain.saffy.D2.q1946;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {


    public static void printResult(int testCase, List<String> resultList) {
        System.out.println("#" + testCase);
        for (int i = 0; i <= resultList.size() / 10; i++) {
            for (int j = i * 10; j < i * 10 + 10 && j < resultList.size(); j++) {
                System.out.print(resultList.get(j));
            }
            System.out.println();
        }
    }


    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int T;

        T = scanner.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int n = scanner.nextInt();
            String[] strList = new String[n];
            int[] cntList = new int[n];
            List<String> resultList = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                strList[i] = scanner.next();
                cntList[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < cntList[i]; j++) {
                    resultList.add(strList[i]);
                }
            }

            printResult(test_case, resultList);
        }
    }
}