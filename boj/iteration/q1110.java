package iteration;

import java.util.Scanner;

public class q1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int i = 1;

        int ten = a / 10;
        int one = a % 10;
        int result = (ten + one) % 10;

        while ((result + one * 10) != a) {
            ten = (result + one * 10) / 10;
            one = (result + one * 10) % 10;
            result = (ten + one) % 10;
            i++;
        }
        System.out.println(i);
    }
}
