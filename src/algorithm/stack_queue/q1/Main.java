package algorithm.stack_queue.q1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        int sum = 0;
        for (int i = 0; i < N; i += 2) {
            resultList.add(Math.abs(arr[i + 1] - arr[i]));
            sum += Math.abs(arr[i + 1] - arr[i]);
        }
        System.out.println(resultList);
        System.out.println(sum);

    }
}