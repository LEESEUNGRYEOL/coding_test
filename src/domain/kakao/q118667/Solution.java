package domain.kakao.q118667;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Long> q1 = new LinkedList<>();
        Queue<Long> q2 = new LinkedList<>();
        int q1Sum = 0;
        int q2Sum = 0;
        int target = 0;
        for (long a : queue1) {
            q1.add(a);
            q1Sum += a;
        }
        for (long b : queue2) {
            q2.add(b);
            q2Sum += b;
        }

        target = (q1Sum + q2Sum) / 2;
        System.out.println("각 큐가 : " + target + " 만큼");

        int cnt = 0;
        while (!q1.isEmpty() && !q2.isEmpty() && q1Sum != q2Sum) {
            if (q1Sum > q2Sum) {
                long tmp = q1.poll();
                q2.add(tmp);
                q2Sum += tmp;
                q1Sum -= tmp;
            } else {
                long tmp = q2.poll();
                q1.add(tmp);
                q1Sum += tmp;
                q2Sum -= tmp;
            }
            cnt++;
        }

        System.out.println("q1의 합은 : "+ q1Sum);
        System.out.println("q2의 합은 : "+ q2Sum);
        System.out.println("총 횟수는 : " + cnt);

        if(q1Sum != q2Sum){
            return -1;
        }
        return cnt;
    }


    public static void main(String[] args) {
        int[] q1 = {101,100};
        int[] q2 = {102,103};

        Solution solution = new Solution();
        System.out.println(solution.solution(q1, q2));
    }
}
