//import java.util.*;
//
//public class Solution {
//    public int[] solution(int []arr) {
//        int[] temp = new int[arr.length];
//        int j = 0;
//
//        temp[0] = arr[0];
//        for(int i = 1; i < arr.length; i++){
//            if(arr[i] == arr[i - 1]){
//                continue;
//            } else {
//                j++;
//                temp[j] = arr[i];
//            }
//        }
//
//        int[] answer = new int[j+1];
//        for(int i = 0; i < j+1; i++){
//            answer[i] = temp[i];
//        }
//
//        return answer;
//    }
//}