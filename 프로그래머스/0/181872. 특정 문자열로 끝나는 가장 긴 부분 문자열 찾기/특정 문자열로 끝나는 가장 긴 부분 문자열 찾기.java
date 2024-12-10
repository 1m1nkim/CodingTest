class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int len = myString.length() - pat.length() + 1;
        int index = 0;
        int patLen = pat.length();
        for(int i =0; i<len; i++){
            String a = myString.substring(i, i+patLen);
            if(a.equals(pat)){
                index = i;
            }
        }
        return answer = myString.substring(0, index+ patLen);
    }
}