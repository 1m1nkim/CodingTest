import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        ArrayList<Character> cList = new ArrayList<>();
        for(char c: my_string.toCharArray()){
            cList.add(c);
        }
        for(char c: cList){
            if(answer.contains(String.valueOf(c))){
                ;
            }else{
                answer+=c;
            }
        }
        return answer;
    }
}

//indexOf는 맨 앞 문자열을 기준으로 하기때문에 indexOf로 String에 +하는게 더 좋았을듯