package domain.saffy.D2.q1961;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {

    public static void printResult(int testCase, List<List<String>> result) {
        System.out.println("#" + testCase);
        for(List<String> a: result){
            StringBuilder tmp = new StringBuilder();
            int cnt = 0;
            for(String b : a){
                if(cnt == result.size()){
                    tmp.append(" ");
                    cnt = 0;
                }
                tmp.append(b);
                cnt++;
            }
            System.out.println(tmp);
        }
    }

    public static int[][] shift(int[][] arr) {
        int[][] result = new int[arr.length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[j][arr.length - i - 1] = arr[i][j];
            }
        }
        return result;
    }


    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int T;

        T = scanner.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = scanner.nextInt();
            int[][] arr = new int[N][N];
            List<List<String>> result = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                result.add(new ArrayList<>());
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }
            int[][] tmp = shift(arr);
            for (int k = 0; k < 3; k++) {
                for (int i = 0; i < tmp.length; i++) {
                    for (int j = 0; j < tmp[i].length; j++) {
                        result.get(i).add(Integer.toString(tmp[i][j]));
                    }
                }
                tmp = shift(tmp);
            }

            printResult(test_case,result);
        }
    }
}