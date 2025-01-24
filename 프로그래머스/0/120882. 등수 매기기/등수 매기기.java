import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        double[] averages = new double[score.length];
        
        for (int i = 0; i < score.length; i++) {
            averages[i] = (score[i][0] + score[i][1]) / 2.0;
        }

        Double[] sortedAverages = Arrays.stream(averages).boxed().toArray(Double[]::new);
        Arrays.sort(sortedAverages, Collections.reverseOrder());

        int[] ranks = new int[score.length];
        for (int i = 0; i < averages.length; i++) {
            ranks[i] = Arrays.asList(sortedAverages).indexOf(averages[i]) +1;
        }

        return ranks;
    }
}
