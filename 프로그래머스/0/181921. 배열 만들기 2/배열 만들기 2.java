import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num = l; num <= r; num++) {
            if (isValid(num)) {
                list.add(num);
            }
        }
        if (list.isEmpty()) {
            return new int[]{-1};
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
    private boolean isValid(int num) {
        String s = String.valueOf(num);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '0' && c != '5') {
                return false;
            }
        }
        return true;
    }
}