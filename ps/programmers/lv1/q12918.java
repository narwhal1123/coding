//class Solution {
//    public boolean solution(String s) {
//        boolean answer = false;
//        int length = s.length();
//        if(length == 4 || length == 6){
//            for(int i = 0; i < length; i++){
//                if(s.charAt(i) < '0' || s.charAt(i) > '9'){
//                    break;
//                }
//                if(i == length - 1){
//                    answer = true;
//                }
//            }
//        }
//        return answer;
//    }
//}