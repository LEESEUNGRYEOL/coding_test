package domain.saffy.D2.q1940;

import java.util.Scanner;

class Solution {


    public static void printResult(int testCase, int length) {
        System.out.println("#" + testCase + " " + length);
    }


    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int T;

        T = scanner.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int n = scanner.nextInt();
            int[] commandList = new int[n];
            int[] accelList = new int[n];

            for (int i = 0; i < n; i++) {
                commandList[i] = scanner.nextInt();
                if (commandList[i] == 1 || commandList[i] == 2) {
                    accelList[i] = scanner.nextInt();
                }
            }

            int length = 0;
            int velocity = 0;
            for (int i = 0; i < commandList.length; i++) {
                if (commandList[i] == 1) {
                    velocity += accelList[i];
                    length += velocity;
                }
                if (commandList[i] == 2) {
                    velocity -= accelList[i];
                    if (velocity < 0) {
                        velocity = 0;
                    }
                    length += velocity;
                }
                if (commandList[i] == 0) {
                    length += velocity;
                }
            }

            printResult(test_case, length);
        }
    }
}