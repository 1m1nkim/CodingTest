class Solution {
    public long solution(long num) {
        int answer = 0;  // 반복 횟수를 셈
        
        // num이 1이 될 때까지 반복
        while (num != 1) {
            // 500번을 넘으면 -1을 반환
            if (answer == 500) {
                return -1;
            }
            
            // 짝수일 경우
            if (num % 2 == 0) {
                num /= 2;  // 2로 나눔
            }
            // 홀수일 경우
            else {
                num = num * 3 + 1;  // 3을 곱하고 1을 더함
            }
            
            answer++;  // 반복 횟수 증가
        }
        
        return answer;  // 반복 횟수 반환
    }
}

//아니 이 문제 지들이 내놓고 long 아니여서 계속 틀렸다 나오네 마지막 테스트가 long형의 길이를 넘어서 488에서 끝났던거임
//그런 줄도 모르고 챗지피티 갈겨도 똑같은 코든데 안되서 어이 무 ;;
