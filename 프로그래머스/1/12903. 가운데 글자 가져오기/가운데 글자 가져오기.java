class Solution {
    public String solution(String s) {
        String answer = "";
        int len = s.length()/2;
        if(s.length()%2==0){
            answer = s.substring(len-1, len+1);
        }else{
            answer = s.substring(len, len+1);
        }
        return answer;
    }
}