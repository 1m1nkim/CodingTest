import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> a = new ArrayList();
        for(String s: strArr){
            if(s.contains("ad")){
                ;
            }else{
                a.add(s);
            }
        }
        return a.toArray(new String[0]);
    }
}