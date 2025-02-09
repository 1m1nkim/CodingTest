import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] str_list) {
        List<String> resultList = new ArrayList<>();
        int index = -1;
        String target = ""; 
        
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l") || str_list[i].equals("r")) {
                index = i;
                target = str_list[i];
                break;
            }
        }
        
        if (index == -1) {
            return new String[0];
        }
        
        if (target.equals("l")) {
            for (int i = 0; i < index; i++) {
                resultList.add(str_list[i]);
            }
        } else if (target.equals("r")) {
            for (int i = index + 1; i < str_list.length; i++) {
                resultList.add(str_list[i]);
            }
        }
        
        return resultList.toArray(new String[0]);
    }
}