class Solution {
    public int solution(int n) {
        String a = String.valueOf(Integer.toString(n, 3));
        //10진수에서 3진수로 변환 시 Integer.toString(기준값, 변환 진수);
        StringBuffer aS = new StringBuffer(a);
        String areverse = aS.reverse().toString();
        //3진수에서 10진수로 변환 시 Integer.parseInt(기준값, 변환 진수);
        return Integer.parseInt(areverse, 3);
    }
}