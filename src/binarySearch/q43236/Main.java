package binarySearch.q43236;

import java.util.Arrays;

class Solution {
    public int solution(int distance, int[] rocks, int n) {
        int answer = 0;
        Arrays.sort(rocks);


        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int distance = 25;
        int[] rocks = {2, 14, 11, 21, 17};
        int n = 2;
        Solution solution = new Solution();
        System.out.println(solution.solution(distance,rocks,n));
    }
}
