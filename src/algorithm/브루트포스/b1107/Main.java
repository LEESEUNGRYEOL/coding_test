package algorithm.브루트포스.b1107;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static int count(List<Integer> have, int target) {
        int result = Math.abs(target - 100);

        for (int i = 0; i <= 999999; i++) {
//            System.out.println("==============");
//            System.out.println("i 가: " + i);
            String str = String.valueOf(i);
            int len = str.length();

            boolean isBreak = false;
            for (int j = 0; j < len; j++) {
                if (!have.contains((str.charAt(j)) - '0')) {
                    isBreak = true;
                    break;
                }
            }
            if (!isBreak) {
                int min = Math.abs(target - i) + len;
                result = Math.min(min, result);
            }
//            System.out.println("결과는: " + result);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int target = Integer.parseInt(br.readLine());
        int p = Integer.parseInt(br.readLine());
        int start = 100;
        List<Integer> list = new ArrayList<>();
        if (p != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < p; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            List<Integer> have = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                if (!list.contains(Integer.valueOf(i))) {
                    have.add(i);
                }
            }
//        System.out.println(have);
            System.out.println(count(have, target));
        } else {
            List<Integer> have2 = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                have2.add(i);
            }
            System.out.println(count(have2, target));
        }
    }
}
