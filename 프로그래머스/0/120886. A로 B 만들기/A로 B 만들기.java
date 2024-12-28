import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        return Arrays.equals(a, b) ? 1 : 0;
        //Arrays.equals이라는 메소드는 처음 봣네
    }
}
//처음 답, 그냥 reverse해서 같은건 줄 알았는데 재배열 시 after가 되냐는 뜻 
// StringBuffer a = new StringBuffer(before);
        // if(a.reverse().toString().equals(after)){
        //     return 1;
        // }else{
        //     return 0;
        // }