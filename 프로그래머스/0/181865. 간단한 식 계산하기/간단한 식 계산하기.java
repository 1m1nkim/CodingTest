class Solution {
    public int solution(String binomial) {
        // 문자열을 공백으로 분리
        String[] a = binomial.split(" ");
        
        // 첫 번째와 세 번째 값은 정수로 변환
        int num1 = Integer.valueOf(a[0]);
        int num2 = Integer.valueOf(a[2]);
        String operator = a[1]; // 연산자

        // 연산자에 따른 계산 수행
        int answer = 0;
        if (operator.equals("+")) {
            answer = num1 + num2;
        } else if (operator.equals("-")) {
            answer = num1 - num2;
        } else if (operator.equals("*")) {
            answer = num1 * num2;
        }

        return answer;
    }
}
