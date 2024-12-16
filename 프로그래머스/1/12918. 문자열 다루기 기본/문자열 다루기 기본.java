class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        for(int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                
            }else{
                return false;
            }
        }
        return answer;
    }
}

/* 
class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] sc = s.toCharArray();
        for(int i=0; i<sc.length; i++){
            if(sc[i] >= 49 || sc[i] <= 58){
                answer = true;
            }else{
                answer = false; break;
            }
        }
        return answer;
    }
}*/
//굳이 변환하지 않고 charAt으로 하는구나 ,,, 하ㅜㅡ