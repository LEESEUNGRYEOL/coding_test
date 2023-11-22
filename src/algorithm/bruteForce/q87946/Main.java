package algorithm.bruteForce.q87946;



import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int k, int[][] dungeons) {
        List<List<Integer>> allDungeons = new ArrayList<>();

        generatePermutations(dungeons, new ArrayList<>(), allDungeons);

        List<Integer> possible = new ArrayList<>();
        for (List<Integer> permutation : allDungeons) {
            int stamina = k;
            int count = 0;
            for (int dungeon : permutation) {
                if (stamina >= dungeons[dungeon][0]) {
                    stamina -= dungeons[dungeon][1];
                    count++;
                } else {
                    break;
                }
            }
            possible.add(count);
        }

        int answer = 0;
        for (int count : possible) {
            answer = Math.max(answer, count);
        }

        return answer;
    }

    private void generatePermutations(int[][] dungeons, List<Integer> permutation, List<List<Integer>> result) {
        if (permutation.size() == dungeons.length) {
            result.add(new ArrayList<>(permutation));
            return;
        }

        for (int i = 0; i < dungeons.length; i++) {
            if (!permutation.contains(i)) {
                permutation.add(i);
                generatePermutations(dungeons, permutation, result);
                permutation.remove(permutation.size() - 1);
            }
        }
    }
}




