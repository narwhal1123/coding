package boj.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[num];

        int sum = 0;
        int min = 4000;
        int max = -4000;
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
            sum += arr[i];
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        int range = max - min; // 범위
        double average = (double) sum / (double) num; // 평균

        // counting sort
        int[] counting = new int[range + 1];
        for (int i = 0; i < num; i++) {
            counting[arr[i] - min]++;
        }

        int mode_max = 0; // 최빈 갯수
        int mode = 0; // 최빈값
        for (int i = 0; i < counting.length; i++) {
            if (counting[i] > mode_max) {
                mode_max = counting[i];
            }
        }

        int mode_count = 0;
        for (int i = 0; i < counting.length; i++) {
            if (counting[i] == mode_max) {
                mode_count++;
                mode = i + min;
                if (mode_count == 2) {
                    break;
                }
            }
        }

        for (int i = 1; i < counting.length; i++) {
            counting[i] += counting[i - 1];
        }

        int median = 0; // 중앙값
        for (int i = 0; i < counting.length; i++) {
            if (counting[i] > num / 2) {
                median = i + min;
                break;
            }
        }

        // print
        System.out.println(Math.round(average));
        System.out.println(median);
        System.out.println(mode);
        System.out.println(range);
    }
}
