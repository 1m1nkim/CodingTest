import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> a = new ArrayList();
        for(int i=0; i<arr.length; i++){
            if(flag[i]){
                for(int j=0; j<arr[i]*2; j++){
                    a.add(arr[i]);
                }
            }else{
                for(int j=0; j<arr[i]; j++){
                    a.remove(a.size()-1);
                }
            }
        }
        return a.stream().mapToInt(Integer::intValue).toArray();
    }
}