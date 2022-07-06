//class Solution {
//    public long solution(long n) {
//        long answer = 0;
//        int count = 0;
//        long length = n;
//        while(length > 0){
//            count++;
//            length /= 10;
//        }
//        long[] sortNum = new long[count];
//
//        for(int i = 0; i < count; i++){
//            sortNum[i] = n%10;
//            n /= 10;
//        }
//
//        for(int i = 0; i < count - 1; i++){
//            for(int j = i + 1; j < count; j++){
//                if(sortNum[j] > sortNum[i]){
//                    long temp = sortNum[j];
//                    sortNum[j] = sortNum[i];
//                    sortNum[i] = temp;
//                }
//            }
//        }
//
//        for(int i = 0; i < count; i++){
//            answer = answer*10 + sortNum[i];
//        }
//
//        return answer;
//    }
//}