//class Solution {
//    public int[] solution(int[] arr) {
//        if(arr.length == 1){
//            int[] answer = new int[arr.length];
//            answer[0] = -1;
//            return answer;
//        } else {
//            int[] answer = new int[arr.length - 1];
//            int min = arr[0];
//            int minIndex = 0;
//            for(int i = 0; i < arr.length; i++){
//                if(min > arr[i]){
//                    min = arr[i];
//                    minIndex = i;
//                }
//            }
//            for(int i = 0; i < arr.length; i++){
//                if(i < minIndex){
//                    answer[i] = arr[i];
//                } else if(i == minIndex){
//                    continue;
//                } else{
//                    answer[i-1] = arr[i];
//                }
//            }
//            return answer;
//        }
//    }
//}