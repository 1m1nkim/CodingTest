class Solution {
    public int solution(int[] sides) {
         int a = sides[0];
        int b = sides[1];
        
        int minSide = Math.abs(a - b) + 1;
        int maxSide = a + b - 1;
        
        return maxSide - minSide + 1;
    }
}