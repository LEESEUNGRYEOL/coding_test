package domain.saffy.D2.q2007;

import java.util.Scanner;

class Solution {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int T;

        T = scanner.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            String str = scanner.next();
            String str3 = "";
            StringBuilder str2 = new StringBuilder();
            int result = 0;


            for (int i = 0; i < str.length(); i++) {
                str2.append(str.charAt(i));
                result++;
                str3 = str.replaceAll(String.valueOf(str2), "");
                if (str3.length() < str2.length()) {
                    if(String.valueOf(str2).contains(str3)){
                        System.out.println("#" + test_case + " " + result);
                        break;
                    }
                }
            }
        }
    }
}