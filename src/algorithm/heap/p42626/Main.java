package algorithm.heap.p42626;

import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        int end = 0;
        int total = 0;

        int i = 0;
        while (i < jobs.length|| !pq.isEmpty()) {

            while (i < jobs.length && jobs[i][0] <= end) {
                pq.offer(jobs[i]);
                i++;
            }

            if (!pq.isEmpty()) {
                int[] job = pq.poll();
                end += job[1];
                total += end - job[0];
            } else {
                end = jobs[i][0];
            }
        }

        return total / jobs.length;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
        Solution solution = new Solution();
        System.out.println(solution.solution(jobs));
    }
}
