package basicMath;

import java.util.Scanner;

public class q11653 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int i = 2;

        while (input != 1) {
            if (input % i == 0) {
                System.out.println(i);
                input /= i;
            } else {
                i++;
            }
        }
    }
}

