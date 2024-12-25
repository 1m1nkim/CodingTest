import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] array) {
        String a = Arrays.stream(array)
                         .mapToObj(String::valueOf)
                         .collect(Collectors.joining());
        
        String ab = a.replaceAll("7", "");
        int answer = a.length() - ab.length();
        return answer;
    }
}