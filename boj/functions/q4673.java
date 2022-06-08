package functions;

public class q4673 {
    public static void main(String[] args) {
        int[] num = new int[10001];

        // self number 찾는 로직을 함수로 뺄 수 있을듯
        for (int i = 1; i <= 10000; i++) {
            int j = i;
            int k = j;
            while(j > 0){
                k += j % 10;
                j /= 10;
            }
            if (k <= 10000) {
                num[k] = 1;
            }
        }

        for (int i = 1; i <= 10000; i++) {
            if (num[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
