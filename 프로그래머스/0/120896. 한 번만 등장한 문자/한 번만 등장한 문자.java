import java.util.Arrays;
class Solution {
    public String solution(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        StringBuffer sbAnswer = new StringBuffer();
        for(int i=0; i<charArray.length; i++){
            int sum = 0;
            for(int j=0; j<charArray.length; j++){
                if(charArray[i] == charArray[j]){
                    sum++;
                }
            }
            if(sum == 1){
                sbAnswer.append(charArray[i]);
            }
        }
        return sbAnswer.toString();
    }
}