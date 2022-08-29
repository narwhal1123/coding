package boj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());

        int devil = 665;
        while (num > 0) {
            devil++;
            int count = 0;
            int temp = devil;

            while (temp > 0) {
                if (temp % 10 == 6) {
                    count++;
                    if (count == 3) {
                        num--;
                        break;
                    }
                } else {
                    count = 0;
                }
                temp /= 10;
            }
        }

        System.out.println(devil);
    }
}

// using String.valueOf
//public class Main {
//    public static void main(String[] args) {
//        Scanner put = new Scanner(System.in);
//        int testValue = put.nextInt();
//        int num = 666;
//        int count = 1;
//
//        while(count != testValue) {
//            num++;
//            if(String.valueOf(num).contains("666")) {
//                count++;
//            }
//        }
//        System.out.println(num);
//    }
//}
