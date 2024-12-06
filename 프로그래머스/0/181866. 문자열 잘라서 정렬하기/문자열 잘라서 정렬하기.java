import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] parts = myString.split("x");

        List<String> filtered = new ArrayList<>();
        for (String part : parts) {
            if (!part.isEmpty()) {
                filtered.add(part);
            }
        }

        Collections.sort(filtered);

        return filtered.toArray(new String[0]);
    }
}

//처음엔 x로 split해두고 빈칸을 없애지 않아서 오류가 나옴