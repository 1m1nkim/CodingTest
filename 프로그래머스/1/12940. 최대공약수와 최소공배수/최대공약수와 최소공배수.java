class Solution {
    public int[] solution(int n, int m) {
        int gcdValue = gcd(n, m); // 최대공약수 구하기
        int lcmValue = (n * m) / gcdValue; // 최소공배수 구하기
        
        return new int[]{gcdValue, lcmValue};
    }
    
    // 최대공약수를 구하는 함수 (유클리드 호제법)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
