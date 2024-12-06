import java.util.*;

class Solution {
    public String[] solution(String myString) {
        // "x"로 문자열 나누기
        String[] parts = myString.split("x");

        // 빈 문자열 제거
        List<String> filtered = new ArrayList<>();
        for (String part : parts) {
            if (!part.isEmpty()) { // 빈 문자열이 아닌 경우 추가
                filtered.add(part);
            }
        }

        // 정렬
        Collections.sort(filtered);

        // 배열로 변환하여 반환
        return filtered.toArray(new String[0]);
    }
}
