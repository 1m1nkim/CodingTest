class Solution {
    public int solution(int left, int right) {
        
        int sum = 0;
        for(int i=left; i<=right; i++){
            int answer = 0;
            for(int j=1; j<=i; j++){
                if(i%j == 0){
                    answer++;
                }
            }
            if(answer%2 == 0){
                    sum += i;
                }else{
                    sum -= i;
                }
        }
        return sum;
    }
}