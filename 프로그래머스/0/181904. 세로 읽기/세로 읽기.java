import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";

        ArrayList<String> mWords = IntStream.range(0, (my_string.length() + m - 1) / m)
                .mapToObj(i -> my_string.substring(i * m, Math.min((i + 1) * m, my_string.length())))
                .collect(Collectors.toCollection(ArrayList::new));

        for (String word : mWords) {
            if (c - 1 < word.length()) {
                answer += word.charAt(c - 1);
            }
        }

        return answer;
    }
}


//m글자씩 끊어서 배열 생성 후 c번 글자 가져오기 substring 사용하면 편할듯
//근데 챗 지피티 사용해서 stream으로 풀었음
//import java.util.*; import java.util.stream.*;
//위 두개 임포트 하는게 다른걸 처음 알았네;