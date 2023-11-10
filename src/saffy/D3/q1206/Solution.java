package saffy.D3.q1206;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);

        for (int test_case = 1; test_case <= 10; test_case++) {
            int towerNum = scanner.nextInt();
            int[] tower = new int[towerNum + 1];

            for (int i = 1; i < tower.length; i++) {
                tower[i] = scanner.nextInt();
            }

            int sum = 0;
            for (int i = 3; i < tower.length; i++) {
                if (tower[i - 2] < tower[i] && tower[i - 1] < tower[i] && tower[i + 1] < tower[i]
                        && tower[i + 2] < tower[i]) {
                    int[] arr = new int[5];
                    for (int j = 0; j < 5; j++) {
                        arr[j] = tower[i - 2 + j];
                    }
                    Arrays.sort(arr);
                    sum += arr[4] - arr[3];
                }
            }
            System.out.println("#" + test_case + " " + sum);
        }
    }
}
