package algorithm.sorting.q42746;

import java.util.Arrays;


class Solution {
    public String solution(int[] numbers) {
        String[] strArr = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            strArr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strArr, (a, b) -> (b + a).compareTo(a + b));

        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
        }
        String answer = sb.toString();

        if (answer.charAt(0) == '0') {
            return "0";
        } else {
            return answer;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {6,10,2};
        System.out.println(solution.solution(numbers));
    }
}
