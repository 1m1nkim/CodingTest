import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int left = 0;
        int right = arr.length - 1;
        
        for (int i = 0; i < query.length; i++) {
            int idx = query[i];
            if (i % 2 == 0) {
                right = left + idx;
            } 
            else {
                left = left + idx;
            }
        }
        
        int size = right - left + 1;
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = arr[left + i];
        }
        return answer;
    }
}