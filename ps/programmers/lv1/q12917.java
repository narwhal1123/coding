//class Solution {
//    public String solution(String s) {
//        String answer = "";
//        StringBuilder sb = new StringBuilder();
//        char[] input = new char[s.length()];
//        for(int i = 0; i < s.length(); i++){
//            input[i] = s.charAt(i);
//        }
//
//        for(int i = 0; i < input.length; i++){
//            for(int j = i + 1; j < input.length; j++){
//                if(input[i] < input[j]){
//                    char temp = input[i];
//                    input[i] = input[j];
//                    input[j] = temp;
//                }
//            }
//            sb.append(input[i]);
//        }
//        answer = sb.toString();
//        return answer;
//    }
//}