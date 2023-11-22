package domain.saffy.D3.q1240;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {


    public static void printResult(int testCase, int sum) {
        System.out.println("#" + testCase + " " + sum);
    }

    public static int numCheck(String str) {
        if (str.equals("0001101")) {
            return 0;
        }
        if (str.equals("0011001")) {
            return 1;
        }
        if (str.equals("0010011")) {
            return 2;
        }
        if (str.equals("0111101")) {
            return 3;
        }
        if (str.equals("0100011")) {
            return 4;
        }
        if (str.equals("0110001")) {
            return 5;
        }
        if (str.equals("0101111")) {
            return 6;
        }
        if (str.equals("0111011")) {
            return 7;
        }
        if (str.equals("0110111")) {
            return 8;
        }
        if (str.equals("0001011")) {
            return 9;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            String tmp = "";
            List<Integer> resultList = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                String line = scanner.next();
                if (line.contains("1")) {
                    for (int j = line.length() - 1; j >= 0; j--) {
                        if (line.charAt(j) == '1') {
                            tmp = line.substring(j - 55, j + 1);
                            break;
                        }
                    }
                }
            }

            for (int i = 0; i < tmp.length(); i += 7) {
                resultList.add(numCheck(tmp.substring(i, i + 7)));
            }

            int sum = 0;
            for (int i = 0; i < resultList.size(); i++) {
                if (i % 2 != 0) {
                    sum += resultList.get(i);
                } else {
                    sum += resultList.get(i) * 3;
                }
            }
            if (sum % 10 == 0) {
                sum = 0;
                for (Integer integer : resultList) {
                    sum += integer;
                }
                printResult(test_case, sum);
            } else {
                printResult(test_case, 0);
            }
        }

    }

}
