package algorithm.stack_queue.p42583;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        int queueWeight = 0;
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> wait = new LinkedList<>();

        for (int a : truck_weights) {
            wait.add(a);
        }
        for (int i = 0; i < bridge_length; i++) {
            queue.add(0);
        }

        while (!queue.isEmpty()) {
            if (queue.size() == bridge_length) {
                queueWeight -= queue.poll();
            }
            if (!wait.isEmpty()) {
                if (queueWeight + wait.peek() <= weight) {
                    queueWeight += wait.peek();
                    queue.add(wait.poll());
                } else {
                    queue.add(0);
                }
            } else {
                queue.poll();
            }
            time++;
//            System.out.println("time: " + time + " " + queue);
        }
        time++;
        return time;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bridge_length = scanner.nextInt();
        int weight = scanner.nextInt();
        int[] truck_weights = {10};
        Solution solution = new Solution();
        int result = solution.solution(bridge_length, weight, truck_weights);
        System.out.println(result);

    }
}
