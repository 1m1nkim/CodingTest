import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> ab = new ArrayList();
        for(int a : arr){
            if(a%divisor ==0){
                ab.add(a);
            } 
        }
        if(ab.isEmpty()){
            ab.add(-1);
        }
        return ab.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}