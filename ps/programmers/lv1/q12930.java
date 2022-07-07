//class Solution {
//    public String solution(String s) {
//        String answer = "";
//        StringBuffer sb = new StringBuffer();
//        char[] input = new char[s.length()];
//        for(int i = 0; i < s.length(); i++){
//            input[i] = s.charAt(i);
//        }
//
            // 공백이 여러칸이 가능해서 처리가 조금 복잡해짐
//        int temp = 0;
//        for(int i = 0; i < s.length(); i++){
//            if(input[i] == ' '){
//                sb.append(" ");
//                temp = 0;
//                continue;
//            } else if(temp % 2 == 0){
//                sb.append(Character.toUpperCase(s.charAt(i)));
//            } else {
//                sb.append(Character.toLowerCase(s.charAt(i)));
//            }
//            temp++;
//        }
//        answer = sb.toString();
//        return answer;
//    }
//}