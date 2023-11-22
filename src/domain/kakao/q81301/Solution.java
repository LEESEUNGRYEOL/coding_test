package domain.kakao.q81301;


import java.io.*;

public class Solution {

    static String[] numberList = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static String stringToNum(String s) {
        for (int i = 0; i < 9; i++) {
            if (s.contains(numberList[i])) {
                s = s.replaceAll(numberList[i], Integer.toString(i));
            }
        }
        return s;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StreamTokenizer st;

        String s = br.readLine();
        String result = stringToNum(s);
        System.out.println(result);
    }
}
