class Solution {
    public String solution(String s, int n) {
        char[] charArr = s.toCharArray();
        
        for (int i = 0; i < charArr.length; i++) {
            char c = charArr[i];
            
            if (c == ' ') {
                continue;
            }
            else if (c >= 'a' && c <= 'z') {
                c = (char)((c - 'a' + n) % 26 + 'a');
            }
            else if (c >= 'A' && c <= 'Z') {
                c = (char)((c - 'A' + n) % 26 + 'A');
            }
            charArr[i] = c;
        }
        
        return new String(charArr);
    }
}
