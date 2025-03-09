class Solution {
    public int solution(int[] common) {
        int length = common.length;
        int last = common[length - 1];
        
        int d = common[1] - common[0];
        if (common[2] - common[1] == d) {
            return last + d;
        }
        
        int r = common[1] / common[0];
        return last * r;
    }
}