import java.util.*;

public class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> resultList = new ArrayList<>();

        for (int num : arr) {
            if (!seen.contains(num)) {
                seen.add(num);
                resultList.add(num);
            }
            if (resultList.size() == k) break;
        }

        while (resultList.size() < k) {
            resultList.add(-1);
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
