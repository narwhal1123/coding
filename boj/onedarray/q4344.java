package onedarray;

import java.util.Scanner;

public class q4344 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();

        for (int i = 0; i < tc; i++) {
            int num = scanner.nextInt();
            int[] score = new int[num];
            int sum = 0;
            double average = 0;
            for (int j = 0; j < num; j++) {
                score[j] = scanner.nextInt();
                sum += score[j];
            }
            average = (double) sum / (double) num;
            int overAverage = 0;
            for (int k = 0; k < num; k++) {
                if ((double)score[k] > average) {
                    overAverage++;
                }
            }
            //% 출력 %%
            System.out.printf("%.3f%%\n", (double)overAverage/num * 100);
        }
    }
}
