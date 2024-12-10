import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> a = new ArrayList();
        for(int i=0; i<intStrs.length; i++){
            intStrs[i] = intStrs[i].substring(s, s+l);
        }
        for(int i=0; i<intStrs.length; i++){
            if(Integer.valueOf(intStrs[i]) > k){
                a.add(Integer.valueOf(intStrs[i]));
            }
        }
        return a.stream().mapToInt(Integer::intValue).toArray();
    }
}