package algorithm.sorting.q42747;

import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);

        int n = citations.length;
        int hIndex = n;
        for (int i = 0; i < n; i++) {

            if (citations[i] >= hIndex) {
                break;
            }

            hIndex--;
        }

        return hIndex;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {3,0,6,1,5};
        System.out.println(solution.solution(arr));
    }
}
