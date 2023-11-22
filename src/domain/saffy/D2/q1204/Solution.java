package domain.saffy.D2.q1204;

import java.util.Scanner;

class Solution {

    public static int findMax(int[] arr) {
        int MAX = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (MAX <= arr[i]) {
                MAX = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int T;

        T = scanner.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int i = scanner.nextInt();
            int[] arr = new int[101];
            for (int j = 0; j < 1000; j++) {
                int tmp = scanner.nextInt();
                arr[tmp]++;
            }
            System.out.println("#" + i + " " + findMax(arr));
        }
    }
}