import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer[] = new int[array.length];
        
        for (int i = 0; i < array.length; i++) {
            answer[i] = Math.abs(n - array[i]);
        }
        
        int min = answer[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (min > answer[i] || (min == answer[i] && array[i] < array[index])) {
                //가까운수가 여러개라면 작은수를 리턴
                min = answer[i];
                index = i;
            }
        }
        
        return array[index];
    }
}
