package algorithm.binarySearch.q11725;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static int[] findParents(List<List<Integer>> nodes) {
        int n = nodes.size() - 1;
        int[] parents = new int[n + 1];
        boolean[] visited = new boolean[n + 1];

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visited[1] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int neighbor : nodes.get(node)) {
                if (!visited[neighbor]) {
                    parents[neighbor] = node;
                    queue.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
        return parents;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> nodes = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            nodes.add(new ArrayList<>());
        }

        for (int i = 1; i < n; i++) {
            int node1 = scanner.nextInt();
            int node2 = scanner.nextInt();
            nodes.get(node1).add(node2);
            nodes.get(node2).add(node1);
        }

        int[] parents = findParents(nodes);

        for (int i = 2; i <= n; i++) {
            System.out.println(parents[i]);
        }
    }
}
