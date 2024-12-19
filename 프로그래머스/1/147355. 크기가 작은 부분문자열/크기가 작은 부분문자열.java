class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = t.length() - p.length()+1;
        for(int i=0; i<len; i++){
            if(Long.parseLong(t.substring(i,i + p.length())) <= Long.parseLong(p)){
                answer++;
            }
        }
        return answer;
    }
}