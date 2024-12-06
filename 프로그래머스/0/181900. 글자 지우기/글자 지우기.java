import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        ArrayList<Character> list = new ArrayList<>();
        for (char c : my_string.toCharArray()) {
            list.add(c);
        }
        Arrays.sort(indices);
        for (int i = indices.length - 1; i >= 0; i--) {
            list.remove(indices[i]);
        }

        StringBuilder answer = new StringBuilder();
        for (char c : list) {
            answer.append(c);
        }
        
        return answer.toString();
    }
}
