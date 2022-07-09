//class Solution {
//    public int solution(int n) {
//        int answer = 0;
//        int[] prime = new int[n + 1];
//        prime[1] = 1;
//        for(int i = 3; i < prime.length; i++){
//            for(int j = 2; j * j <= i; j++){
//                if(i % j == 0){
//                    prime[i] = 1;
//                    break;
//                }
//            }
//        }
//
//        for(int i = 1; i < prime.length; i++){
//            if(prime[i] == 0){
//                answer++;
//            }
//        }
//        return answer;
//    }
//}