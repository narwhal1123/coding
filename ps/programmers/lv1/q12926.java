//class Solution {
//    public String solution(String s, int n) {
//        String answer = "";
//        char[] input = new char[s.length()];
//        StringBuffer sb = new StringBuffer();
//
//        for(int i = 0; i < s.length(); i++){
//            input[i] = s.charAt(i);
//            if(input[i] >= 'a' && input[i] <= 'z'){
//                input[i] = (char)(input[i] + n);
//                if(input[i] > 'z'){
//                    input[i] = (char)(input[i] - 26);
//                }
//            } else if(input[i] >= 'A' && input[i] <= 'Z'){
//                input[i] = (char)(input[i] + n);
//                if(input[i] > 'Z'){
//                    input[i] = (char)(input[i] - 26);
//                }
//            }
//            sb.append(input[i]);
//        }
//        answer = sb.toString();
//        return answer;
//    }
//}