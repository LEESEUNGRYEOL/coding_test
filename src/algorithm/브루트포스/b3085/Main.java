package algorithm.브루트포스.b3085;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.ImageIcon;


// 1. 사탕게임
public class Main {
    public static int checkLength(char[][] arr) {
        int max = 1;
        List<Integer> maxList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                if (arr[i][j] == arr[i][j + 1]) {
                    max++;
                } else {
                    maxList.add(max);
                    max = 1;
                }
            }
            maxList.add(max);
            max = 1;
            for (int j = 0; j < arr[i].length - 1; j++) {
                if (arr[j][i] == arr[j + 1][i]) {
                    max++;
                } else {
                    maxList.add(max);
                    max = 1;
                }
            }
            maxList.add(max);
            max = 1;
        }
        Collections.sort(maxList);
        return maxList.get(maxList.size() - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int N = Integer.parseInt(s);

        char[][] arr = new char[N][N];

        for (int i = 0; i < N; i++) {
            String tmp = br.readLine();
            arr[i] = tmp.toCharArray();
        }

        List<Integer> cntList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                char p = arr[i][j];
                if (i + 1 < N && p != arr[i + 1][j]) {
                    char tmp;
                    tmp = arr[i][j];
                    arr[i][j] = arr[i + 1][j];
                    arr[i + 1][j] = tmp;
//                    System.out.println(p + "와" + arr[i][j] + "를 교환했을때");
//                    System.out.println("나올수 있는 최대길이는 : " + checkLength(arr));
                    cntList.add(checkLength(arr));
                    tmp = arr[i][j];
                    arr[i][j] = arr[i + 1][j];
                    arr[i + 1][j] = tmp;
                }
                if (j + 1 < N && p != arr[i][j + 1]) {
                    char tmp;
                    tmp = arr[i][j];
                    arr[i][j] = arr[i][j + 1];
                    arr[i][j + 1] = tmp;
//                    System.out.println(p + "와" + arr[i][j] + "를 교환했을때");
//                    System.out.println("나올수 있는 최대길이는 : " + checkLength(arr));
                    cntList.add(checkLength(arr));
                    tmp = arr[i][j];
                    arr[i][j] = arr[i][j + 1];
                    arr[i][j + 1] = tmp;
                }
            }
        }
        Collections.sort(cntList);
        System.out.println(cntList.get(cntList.size() - 1));
    }


}
