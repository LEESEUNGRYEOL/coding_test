package algorithm.hash.p42577;


import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for(String player: participant)
        {
            map.put(player,map.getOrDefault(player,0)+1);
        }
//        System.out.println("map = " + map);

        for(String complete: completion)
        {
            map.put(complete,map.get(complete)-1);
        }

//        System.out.println("map = " + map);

        for(String key: map.keySet())
        {
            if(map.get(key) == 1)
            {
                answer+= key;
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] p1 = {"leo", "kiki", "eden"};
        String[] c1 = {"eden", "kiki"};
        String answer = solution.solution(p1, c1);
        System.out.println(answer);
    }
}
