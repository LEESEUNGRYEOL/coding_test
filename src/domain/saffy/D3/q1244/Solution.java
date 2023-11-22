import java.util.Scanner;

public class Solution {

    private static int T;
    private static int[] numbers;
    private static int count;
    private static int max;

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();

        for (int testCase = 1; testCase <= T; testCase++) {
            initNumbersAndCount(scanner);
            max = Integer.MIN_VALUE;
            makeMaxNumber(0, 0);
            printResult(testCase, max);
        }
    }

    private static void initNumbersAndCount(Scanner scanner) {
        String string = scanner.next();
        numbers = new int[string.length()];

        for (int index = 0; index < string.length(); index++) {
            numbers[index] = string.charAt(index) - '0';
        }
        count = scanner.nextInt();
    }

    private static void makeMaxNumber(int start, int cnt) {
        int standardNumber = numbers[start];

        if (cnt == count) {
            max = Math.max(max, toNumber());
            return;
        }

        if (start == numbers.length - 1) {
            numbers[start] = numbers[start - 1];
            numbers[start - 1] = standardNumber;
            makeMaxNumber(start - 1, cnt + 1);
            numbers[start - 1] = numbers[start];
            numbers[start] = standardNumber;
            return;
        }

        for (int index = start + 1; index < numbers.length; index++) {
            if (standardNumber <= numbers[index]) {
                numbers[start] = numbers[index];
                numbers[index] = standardNumber;
                makeMaxNumber(start + 1, cnt + 1);
                numbers[index] = numbers[start];
                numbers[start] = standardNumber;
            }
        }
        makeMaxNumber(start + 1, cnt);
    }

    private static int toNumber() {
        int number = 0;
        for (int index = numbers.length - 1; index >= 0; index--) {
            number += Math.pow(10, numbers.length - index - 1) * numbers[index];
        }
        return number;
    }

    private static void printResult(int testCase, int result) {
        System.out.println("#" + testCase + " " + result);
    }
}
