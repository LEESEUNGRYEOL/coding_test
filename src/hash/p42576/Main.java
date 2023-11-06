package hash.p42576;


import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i);
        }

        for (String s : phone_book) {
            for (int j = 0; j < s.length(); j++) {
                if (map.containsKey(s.substring(0, j))) {
                    return false;
                }
            }
        }

        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] phone_book1 = {"1195524421", "97674223", "119"};
//        int[] phone_book2 = {123, 456, 789};
//        int[] phone_book3 = {12, 123, 1235, 567, 88};
        boolean result = sol.solution(phone_book1);
//        boolean result1 = sol.solution(phone_book2);
//        boolean result2 = sol.solution(phone_book3);
        System.out.println(result);
//        System.out.println(result1);
//        System.out.println(result2);
    }
}


