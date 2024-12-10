class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int len = myString.length() - pat.length() + 1;
        int index = 0;
        int patLen = pat.length();
        if(myString.substring(myString.length()-patLen, myString.length()-patLen+1).equals(pat)){
            return myString;
        }
        for(int i =0; i<len; i++){
            String a = myString.substring(i, i+pat.length());
            if(a.equals(pat)){
                index = i;
            }
        }
        return answer = myString.substring(0, index+ pat.length());
    }
}