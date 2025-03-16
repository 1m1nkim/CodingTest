class Solution {
    public int solution(int n) {
        int count = 0; // 3x 마을의 숫자를 찾기 위한 카운트
        int num = 0; 
        
        while (count < n) { 
            num++;
            if (num % 3 == 0 || String.valueOf(num).contains("3")) {
                continue;
            }
            count++;
        }
        
        return num;
    }
}