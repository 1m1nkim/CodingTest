class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        for(int i =0; i< emergency.length; i++){
            int sum=0;
            for(int j=0; j<emergency.length; j++){
                sum += emergency[i] <= emergency[j]? 1: 0;
            }
            answer[i] = sum;
        }
        return answer;
    }
}