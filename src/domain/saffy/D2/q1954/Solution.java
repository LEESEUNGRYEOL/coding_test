package domain.saffy.D2.q1954;

import java.util.Scanner;
import java.util.Stack;

class Solution {

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void printResult(int testCase, int[][] result) {
        System.out.println("#" + testCase);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] makeSnail(int N) {
        boolean[][] isVisited = new boolean[N][N];
        int[][] arr = new int[N][N];
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{0, 0});
        int p = 1;
        arr[0][0] = p;
        isVisited[0][0] = true;
        int direction = 0;

        while (!stack.isEmpty()) {
            int[] node = stack.pop();
            arr[node[0]][node[1]] = p++;

            int nx = node[1] + dx[direction];
            int ny = node[0] + dy[direction];

            if (nx < 0 || ny < 0 || nx > N - 1 || ny > N - 1|| isVisited[ny][nx]) {
                direction = (direction + 1) % 4;
                nx = node[1] + dx[direction];
                ny = node[0] + dy[direction];
            }
            if (nx >= 0 && ny >= 0 && nx < N && ny < N && !isVisited[ny][nx]) {
                stack.push(new int[]{ny, nx});
                isVisited[ny][nx] = true;
            }
        }
        return arr;
    }

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int T;

        T = scanner.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = scanner.nextInt();

            int[][] result = makeSnail(N);
            printResult(test_case, result);
        }
    }
}