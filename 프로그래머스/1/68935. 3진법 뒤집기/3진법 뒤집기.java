class Solution {
    public int solution(int n) {
        int answer = 0;
        String a = String.valueOf(Integer.toString(n, 3));
        StringBuffer aS = new StringBuffer(a);
        String areverse = aS.reverse().toString();
        answer = Integer.parseInt(areverse, 3);
        return answer;
    }
}