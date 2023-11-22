package domain.saffy.D3.q12368;

import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int T;

        T = scanner.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int result = a + b;
            while (result - 24 >= 0) {
                result -= 24;
            }
            System.out.println("#" + test_case + " " + result);
        }
    }
}