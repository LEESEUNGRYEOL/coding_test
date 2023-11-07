package saffy.D3.q3431;

import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int T;

        T = scanner.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int L = scanner.nextInt();
            int U = scanner.nextInt();
            int X = scanner.nextInt();
            if (L > X) {
                System.out.println("#" + test_case + " " + (L - X));
            } else if (X > U) {
                System.out.println("#" + test_case + " " + -1);
            } else {
                System.out.println("#" + test_case + " " + 0);
            }
        }
    }
}