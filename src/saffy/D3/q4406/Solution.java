package saffy.D3.q4406;

import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int T;

        T = scanner.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            String str = scanner.next();
            str = str.replaceAll("[aeiou]", "");
            System.out.println("#" + test_case + " " + str);
        }
    }
}