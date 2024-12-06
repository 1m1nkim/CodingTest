class Solution {
    public int solution(int a, int b, int k) {
        int answer = 0;

        for (int i = a; i <= b; i++) {
            String str = String.valueOf(i);
            char target = String.valueOf(k).charAt(0);

            for (char ch : str.toCharArray()) {
                if (ch == target) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
