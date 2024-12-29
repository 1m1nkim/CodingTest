class Solution {
    public int solution(String s) {
        int answer = 0;
        String sList[] = s.split(" ");
        for(int i=0; i<sList.length;i++){
            if(!sList[i].equals("Z")){
                answer += Integer.parseInt(sList[i]);
            }else{
                answer -= Integer.parseInt(sList[i-1]);
            }
        }
        return answer;
    }
}