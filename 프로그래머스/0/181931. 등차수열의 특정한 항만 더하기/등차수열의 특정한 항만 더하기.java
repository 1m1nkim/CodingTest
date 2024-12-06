import java.util.stream.*;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        return IntStream.range(0, included.length)
                .filter(i -> included[i])
                .map(i -> a + d * i)          
                .sum();                           
    }
}

//배열 stream으로 바꾸는거 연습하기
// map은 모든 객체에 함수를 적용하기 