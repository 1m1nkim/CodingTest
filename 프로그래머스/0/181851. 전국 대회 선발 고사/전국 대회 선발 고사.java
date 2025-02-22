import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<int[]> students = new ArrayList<>();
        for (int i = 0; i < rank.length; i++) {
            students.add(new int[]{i, rank[i]});
        }
        
        Collections.sort(students, (a, b) -> Integer.compare(a[1], b[1]));
        
        int[] selected = new int[3];
        int cnt = 0;
        
        for (int[] student : students) {
            if (attendance[student[0]]) {
                selected[cnt++] = student[0];
                if (cnt == 3) break;
            }
        }
        
        return 10000 * selected[0] + 100 * selected[1] + selected[2];
    }
}