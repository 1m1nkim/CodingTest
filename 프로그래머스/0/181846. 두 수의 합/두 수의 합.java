import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        // BigInteger로 변환
        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);
        
        // 두 BigInteger의 합 계산
        BigInteger sum = bigA.add(bigB);
        
        // 결과를 문자열로 변환하여 반환
        return sum.toString();
    }
}
