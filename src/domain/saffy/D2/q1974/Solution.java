package domain.saffy.D2.q1974;

import java.util.HashSet;
import java.util.Scanner;

class Solution {

    public static void printResult(int testCase, boolean result) {
        if(result){
            System.out.println("#" + testCase + " " + 1);
        }else{
            System.out.println("#" + testCase + " " + 0);
        }
    }

    public static boolean boxCheck(int[][] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 9; i += 3) {
            for (int j = i; j < i + 3; j++) {
                for (int k = i; k < i + 3; k++) {
                    set.add(arr[j][k]);
                }
            }
            if (set.size() != 9) {
                return false;
            }
            set.clear();
        }
        return true;
    }


    public static boolean rowCheck(int[][] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                set.add(arr[j][i]);
            }
            if(set.size() !=9){
                return false;
            }
            set.clear();
        }
        return true;
    }

    public static boolean columnCheck(int[][] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                set.add(arr[i][j]);
            }
            if(set.size() !=9){
                return false;
            }
            set.clear();
        }
        return true;
    }

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int T;

        T = scanner.nextInt();
        boolean result;
        for (int test_case = 1; test_case <= T; test_case++) {

            int[][] arr = new int[9][9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }
            if(boxCheck(arr) && rowCheck(arr) && columnCheck(arr)){
                result = true;
            }else{
                result =false;
            }


            printResult(test_case, result);
        }
    }
}