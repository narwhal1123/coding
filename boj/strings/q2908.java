package strings;

import java.util.Scanner;

public class q2908 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        a = reverseNum(a);
        b = reverseNum(b);

        if (a >= b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    public static int reverseNum(int num) {
        num = (num%10)*100 + ((num/10)%10)*10 + num/100;
        return num;
    }
}
