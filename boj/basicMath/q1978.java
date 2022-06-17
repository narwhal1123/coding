package basicMath;

import java.util.Scanner;

public class q1978 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        int[] num = new int[testcase];
        int count = 0;

        for (int i = 0; i < testcase; i++) {
            num[i] = scanner.nextInt();
            if (num[i] == 1) {
                continue;
            } else if (num[i] == 2) {
                count++;
            } else {
                int prime = 0;
                for (int j = 2; j * j <= num[i]; j++) {
                    if (num[i] % j == 0) {
                        prime = 1;
                        break;
                    }
                }
                if (prime == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
