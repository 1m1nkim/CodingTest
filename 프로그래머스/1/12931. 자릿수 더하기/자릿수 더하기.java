import java.util.*;

public class Solution {
    public int solution(int n) {
        String a =  Integer.toString(n); 
        String[] p = a.split("");
        int answer = 0;
        for(int i=0; i< p.length; i++){
            answer += Integer.parseInt(p[i]);
        }
        return answer;
    }
}