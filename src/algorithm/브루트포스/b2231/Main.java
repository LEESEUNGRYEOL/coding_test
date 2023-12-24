package algorithm.브루트포스.b2231;

import java.util.Scanner;

public class Main {
    public static long findNum(int n) {
        long a = 1;
        while (a < 1000000) {
            long tmp = a;
            int sum = 0;
            sum += a;
            while (a > 0) {
                sum += (a % 10);
                a /= 10;
            }
            if (sum == n) {
                return tmp;
            }
            a = tmp;
            a++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(findNum(n));
    }
}
