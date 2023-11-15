package dfs_bfs.q1844;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static int bfs(int[][] maps) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        maps[0][0] = 2;

        while (!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                int[] node = queue.poll();
                for (int j = 0; j < 4; j++) {
                    int nx = node[1] + dx[j];
                    int ny = node[0] + dy[j];
                    if (nx < 0 || ny < 0 || nx > maps[0].length - 1 || ny > maps.length - 1) {
                        continue;
                    }
                    if (maps[ny][nx] == 1) {
                        maps[ny][nx] += maps[node[0]][node[1]];
                        queue.add(new int[]{ny, nx});
                    }
                }
            }
        }
        return maps[maps.length - 1][maps[0].length - 1] - 1;
    }

    public int solution(int[][] maps) {
        int result = bfs(maps);
        if (result == 0) {
            return -1;
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        int[][] map = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        Solution solution = new Solution();
        int result = solution.solution(map);
        System.out.println(result);
    }
}
