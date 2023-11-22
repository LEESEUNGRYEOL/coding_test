package algorithm.heap.p42627;

import java.util.PriorityQueue;
import java.util.Scanner;

class Solution {
    public int solution(int[] scoville, int k) {
        int result = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int a : scoville) {
            priorityQueue.add(a);
        }
        while (priorityQueue.peek() < k) {
            if (priorityQueue.size() == 1) {
                return -1;
            }
            int a = priorityQueue.poll();
            int b = priorityQueue.poll();
            priorityQueue.add(a + (b * 2));
            result++;
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scoville = {12, 2, 3, 9, 10, 1};
        int k = 7;
        Solution solution = new Solution();
        System.out.println(solution.solution(scoville, k));
    }
}
