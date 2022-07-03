//class Solution {
//    public String solution(String phone_number) {
//        String answer = "";
//        int stringLength = phone_number.length();
//        StringBuffer sb = new StringBuffer();
//        for(int i = 0; i < stringLength - 4; i++){
//            sb.append("*");
//        }
//        sb.append(phone_number.substring(stringLength - 4, stringLength));
//        answer = sb.toString();
//        return answer;
//    }
//}