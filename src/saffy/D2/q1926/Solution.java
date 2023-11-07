package saffy.D2.q1926;

import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            String num = Integer.toString(i);
            if (num.contains("3") || num.contains("6") || num.contains("9")) {
                num = num.replaceAll("3", "-");
                num = num.replaceAll("6", "-");
                num = num.replaceAll("9", "-");
                num = num.replaceAll("1", "");
                num = num.replaceAll("2", "");
                num = num.replaceAll("4", "");
                num = num.replaceAll("5", "");
                num = num.replaceAll("7", "");
                num = num.replaceAll("8", "");
                num = num.replaceAll("0", "");

            }
            System.out.print(num + " ");
        }
    }
}
