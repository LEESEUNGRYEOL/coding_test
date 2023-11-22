package algorithm.graph.q2606;

import java.util.*;

public class Main {


    public static int BFS(List<List<Integer>> graph, int startNode, int n) {

        boolean[] visited = new boolean[n + 1];
        visited[startNode] = true;

        int cnt = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(startNode);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    cnt++;
                    queue.offer(neighbor);
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int computers = scanner.nextInt();
        int edges = scanner.nextInt();

        List<List<Integer>> graph = new LinkedList<>();

        for (int i = 0; i <= computers; i++) {
            graph.add(new ArrayList<>());
        }


        for (int i = 0; i < edges; i++) {
            int node1 = scanner.nextInt();
            int node2 = scanner.nextInt();
            graph.get(node1).add(node2);
            graph.get(node2).add(node1);
        }

        int result = BFS(graph, 1, computers);
        System.out.println(result);

    }
}
