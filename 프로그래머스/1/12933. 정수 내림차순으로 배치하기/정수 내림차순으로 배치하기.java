import java.util.Arrays;

public class Solution {
    public long solution(long n) {
        long answer = 0;

        // long 값을 문자열로 변환
        String s = String.valueOf(n);
        System.out.println(n);

        // 각 자릿수를 String 배열로 분리
        String[] answers = s.split("");
        int[] intArray = new int[answers.length];

        // String 배열을 int 배열로 변환
        for (int i = 0; i < answers.length; i++) {
            intArray[i] = Integer.parseInt(answers[i]);
        }

        // 버블 정렬(Bubble Sort) 방식으로 내림차순 정렬
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] < intArray[j]) {
                    int temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }

        // 정렬된 배열을 다시 하나의 숫자로 결합
        StringBuilder sb = new StringBuilder();
        for (int num : intArray) {
            sb.append(num);  // 각 자릿수를 이어붙임
        }

        // 결합된 숫자를 long 타입으로 변환하여 반환
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}
