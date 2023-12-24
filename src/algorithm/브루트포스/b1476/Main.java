package algorithm.브루트포스.b1476;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


// 1476번: 날짜계산 (브루트 포스)
public class Main {
    public static boolean countDay(int[] arr, int[] result) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
        }
        if (arr[0] > 15) {
            arr[0] = 1;
        }
        if (arr[1] > 28) {
            arr[1] = 1;
        }
        if (arr[2] > 19) {
            arr[2] = 1;
        }
        return Arrays.equals(arr, result);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int[] result = new int[st.countTokens()];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(st.nextToken());
        }


        int[] arr = {1, 1, 1};

        int cnt = 1;
        if(Arrays.equals(arr, result)){
            System.out.println(cnt);
            return;
        }

        while (!countDay(arr, result)) {
            cnt++;
        }
        System.out.println(cnt+1);
    }
}
