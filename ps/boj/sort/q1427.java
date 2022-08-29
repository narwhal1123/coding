package boj.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());

        int length = 0;
        int temp = num;
        while (temp > 0) {
            temp /= 10;
            length++;
        }

        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = num % 10;
            num /= 10;
        }

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int a : arr) {
            System.out.print(a);
        }
    }
}

// 그냥 char배열로 만들고 정렬후 뒤에부터 찍어도 된다
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String N = sc.next();
//
//        char[] arr = N.toCharArray();
//        Arrays.sort(arr);
//
//        for(int i = arr.length - 1; i >= 0; i--) {
//            System.out.print(arr[i]);
//        }
//    }
//}