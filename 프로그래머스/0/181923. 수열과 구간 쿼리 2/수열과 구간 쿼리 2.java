import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> result = new ArrayList<>();

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];

            int min = Integer.MAX_VALUE;
            boolean found = false;

            for (int i = s; i <= e; i++) {
                if (arr[i] > k && arr[i] < min) {
                    min = arr[i];
                    found = true;
                }
            }

            result.add(found ? min : -1);
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}