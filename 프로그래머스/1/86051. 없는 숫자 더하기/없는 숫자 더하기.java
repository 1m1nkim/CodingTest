class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int a: numbers){
            answer += a;
        }
        return 45-answer;
    }
}