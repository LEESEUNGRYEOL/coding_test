package domain.saffy.D2.q1288;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

class Solution {
    public static void printResult(int testCase, int length) {
        System.out.println("#" + testCase + " " + length);
    }

    public static List<Integer> getNumbers(int n) {
        List<Integer> numbers = new ArrayList<>();
        while (n > 0) {
            numbers.add(n % 10);
            n /= 10;
        }
        return numbers;
    }

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int T;

        T = scanner.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int n = scanner.nextInt();
            HashSet<Integer> seenList = new HashSet<>();
            int cnt = 0;

            for (int i = 1; seenList.size() < 10; i++) {
                List<Integer> numList = getNumbers(n*i);
                seenList.addAll(numList);
                cnt++;
            }
            int result = n*cnt;
            printResult(test_case, result);
        }
    }
}