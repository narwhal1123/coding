//class Solution {
//    public int[] solution(int n, int m) {
//        int[] answer = new int[2];
//        int max = 0;
//        int min = 0;
//
//        if(n >= m){
//            max = n;
//            min = m;
//        } else {
//            max = m;
//            min = n;
//        }
//        // 유클리드 호제법 GCD(A,B) = GCD(B,A%B)
//        // if A%B=0 -> GCD=B else GCD(B,A%B)
//        // 최소공배수는 두 수 곱하고 최대공약수로 나눠주면 된다.
//        while(max % min != 0){
//            int temp = max;
//            max = min;
//            min = temp % min;
//        }
//
//        answer[0] = min;
//        answer[1] = (m * n) / min;
//        return answer;
//    }
//}