class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for(int i = 0; i<myString.length() - pat.length() + 1; i++){
            String a = myString.substring(i, pat.length()+i);
            if(pat.equals(a)){
                answer++;
            }
        }
        
        return answer;
    }
}

//myString.substring(i).startsWith(pat)
//특정 위치에서 시작해서 pat이 갖고 있는 String 과 같은지 확인한다