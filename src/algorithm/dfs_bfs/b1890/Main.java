package algorithm.dfs_bfs.b1890;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        long[][] dp = new long[N][N];

        dp[0][0] = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int jump = arr[i][j];
                if (jump == 0 && i == N - 1 && j == N - 1) {
                    break;
                }
                if (i + jump < N) {
                    dp[i + jump][j] += dp[i][j];
                }
                if (j + jump < N) {
                    dp[i][j + jump] += dp[i][j];
                }
            }
        }
        System.out.println(dp[N - 1][N - 1]);
    }
}
