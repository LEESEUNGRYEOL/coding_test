package graph.q2667;

import java.util.*;

public class Main {

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void BFS(int[][] graph, int N, int x, int y, List<Integer> sizes) {

        Queue<List<Integer>> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        list.add(x);
        list.add(y);
        queue.offer(list);
        graph[x][y] = 0;

        int size = 1;

        while (!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                List<Integer> node = queue.poll();
                for (int j = 0; j < 4; j++) {
                    int nx = node.get(0) + dx[j];
                    int ny = node.get(1) + dy[j];

                    if (nx >= 0 && nx < N && ny >= 0 && ny < N && graph[nx][ny] == 1) {
                        List<Integer> list2 = new ArrayList<>();
                        list2.add(nx);
                        list2.add(ny);
                        queue.offer(list2);
                        graph[nx][ny] = 0;
                        size++;
                    }
                }
            }
//
//            for (int i = 0; i < N; i++) {
//                for (int j = 0; j < N; j++) {
//                    System.out.print(graph[j][i] + " ");
//                }
//                System.out.println();
//            }
//            System.out.println("------------------------");

        }
        sizes.add(size);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[][] graph = new int[N][N];

        List<Integer> sizes = new ArrayList<>();


        for (int i = 0; i < N; i++) {
            String num = scanner.next();
            for (int j = 0; j < num.length(); j++) {
                graph[j][i] = num.charAt(j) - '0';
            }
        }

//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                System.out.print(graph[j][i] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("------------------------");


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (graph[j][i] == 1) {
                    BFS(graph, N, j, i, sizes);
                }
            }
        }

        Collections.sort(sizes);
        System.out.println(sizes.size());
        for (int size : sizes) {
            System.out.println(size); // 각 단지 크기 출력
        }

    }
}
