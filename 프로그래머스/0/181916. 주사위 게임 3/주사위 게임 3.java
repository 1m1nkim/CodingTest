public class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        int[] freq = new int[7];
        for (int num : dice) {
            freq[num]++;
        }
        
        for (int p = 1; p <= 6; p++) {
            if (freq[p] == 4) {
                return 1111 * p;
            }
        }
        
        for (int p = 1; p <= 6; p++) {
            if (freq[p] == 3) {
                int q = 0;
                for (int num = 1; num <= 6; num++) {
                    if (num != p && freq[num] == 1) {
                        q = num;
                        break;
                    }
                }
                return (int) Math.pow((10 * p + q), 2);
            }
        }
        
        int p = 0, q = 0;
        for (int num = 1; num <= 6; num++) {
            if (freq[num] == 2) {
                if (p == 0) {
                    p = num;
                } else {
                    q = num;
                }
            }
        }
        if (p != 0 && q != 0) {
            return (p + q) * Math.abs(p - q);
        }
        
        for (int num = 1; num <= 6; num++) {
            if (freq[num] == 2) {
                p = num;
                int qCandidate = 0, rCandidate = 0;
                for (int other = 1; other <= 6; other++) {
                    if (other != p && freq[other] == 1) {
                        if (qCandidate == 0) {
                            qCandidate = other;
                        } else {
                            rCandidate = other;
                        }
                    }
                }
                if (qCandidate != 0 && rCandidate != 0) {
                    return qCandidate * rCandidate;
                }
            }
        }
        
        int min = 7;
        for (int num : dice) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}