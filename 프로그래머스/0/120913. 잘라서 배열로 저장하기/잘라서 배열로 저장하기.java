class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length();
        int eachlen = (len + n - 1) / n;
        String[] answer = new String[eachlen];

        for (int i = 0; i < eachlen; i++) {
            int start = i * n;
            int end = Math.min(start + n, len);
            answer[i] = my_str.substring(start, end);
        }

        return answer;
    }
}