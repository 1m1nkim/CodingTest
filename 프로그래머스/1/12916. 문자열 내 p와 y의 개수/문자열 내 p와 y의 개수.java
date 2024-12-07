class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countP = 0;
        int countY = 0;
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                countP++;
            } else if (s.charAt(i) == 'y') {
                countY++;
            }
        }
        return countP == countY;
    }
}