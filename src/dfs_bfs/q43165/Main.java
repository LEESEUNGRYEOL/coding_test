package dfs_bfs.q43165;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {
    static int[] optimizer = {1, -1};

    public int solution(int[] numbers, int target) {

        List<List<Integer>> sumList = new ArrayList<>();
        int[] minusNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            minusNumbers[i] = -numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            sumList.add(new ArrayList<>());
        }

        sumList.get(0).add(numbers[0]);
        sumList.get(0).add(minusNumbers[0]);

        for (int i = 1; i < numbers.length; i++) {
            List<Integer> tmp = sumList.get(i - 1);
            for (int a : tmp) {
                sumList.get(i).add(a + numbers[i]);
                sumList.get(i).add(a + minusNumbers[i]);
            }
        }

        int cnt = 0;
        List<Integer> lastSumList = sumList.get(numbers.length - 1);
        for(int a: lastSumList){
            if(a == target){
                cnt++;
            }
        }
        return cnt;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        Solution solution = new Solution();
        int result = solution.solution(numbers, target);
        System.out.println(result);
    }
}
